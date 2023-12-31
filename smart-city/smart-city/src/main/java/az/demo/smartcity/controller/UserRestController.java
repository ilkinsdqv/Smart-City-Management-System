package az.demo.smartcity.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.demo.smartcity.exception.MyRuntimeException;
import az.demo.smartcity.model.AuthorityModel;
import az.demo.smartcity.model.User;
import az.demo.smartcity.repository.AuthorityRepository;
import az.demo.smartcity.repository.UserRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping()
@CrossOrigin(origins="*")
public class UserRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AuthorityRepository authorityRepository;
	
	@PostMapping(path = "/user-registration")
	public User save(@Valid @RequestBody User user, BindingResult result) {
		if(result.hasErrors()) {
			throw new MyRuntimeException(result);
		}
		Optional<User> userOptional = userRepository.findById(user.getUsername());
		
		if(userOptional.isPresent()) {
			User u = new User();
			u.setUsername("");
			return u;
		}else {
		
			user.setPassword("{noop}"+user.getPassword());
			user.setEnabled(true);
			User savedUser = userRepository.save(user);
			
			AuthorityModel authority = new AuthorityModel();
			authority.setUsername(user.getUsername());
			authority.setAuthority("user");
			authorityRepository.save(authority);
			
			return savedUser;
		}
	}
	
	@GetMapping(path="/login")
	public void login() {
		
	}
}
