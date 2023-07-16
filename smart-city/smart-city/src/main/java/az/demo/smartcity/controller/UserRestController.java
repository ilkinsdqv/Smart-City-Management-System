package az.demo.smartcity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.demo.smartcity.model.User;
import az.demo.smartcity.repository.UserRepository;

@RestController
@RequestMapping()
@CrossOrigin(origins="*")
public class UserRestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping(path = "/user-registration")
	public User save(@RequestBody User user) {
		return userRepository.save(user);
	}
	
}