package az.demo.smartcity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message="Username can not be empty.")
	@Size(min=2,message="Username must contain minimum 2 letters")
	@Size(max=30,message="Username must contain maximum 30 letters")
	private String username;
	
	@NotEmpty(message="Name can not be empty.")
	@Size(min=2,message="Name must contain minimum 2 letters")
	@Size(max=30,message="Name must contain maximum 30 letters")
	private String name;
	
	@NotEmpty(message="Surname can not be empty.")
	@Size(min=2,message="Surname must contain minimum 2 letters")
	@Size(max=30,message="Surname must contain maximum 30 letters")
	private String surname;
	
	@NotEmpty(message="Email can not be empty.")
	@Email(message="Wrong email type.")
	private String email;
	
	@NotEmpty(message="Phone number can not be empty.")
	@Size(max=30,message="Phone number is too long")
	private String phoneNum;
	
	@NotEmpty(message="Location can not be empty.")
	@Size(max=30,message="Location is too long")
	private String location;
	private String gender;
	
	@NotEmpty(message="Password can not be empty.")
	@Size(min=2,message="Password must contain minimum 2 letters")
	@Size(max=30,message="Password must contain maximum 30 letters")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
