package az.demo.smartcity.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

@Entity
public class Feature {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotEmpty(message="Name can not be empty.")
	@Size(min=2,message="Name must contain minimum 2 letters")
	@Size(max=30,message="Name must contain maximum 30 letters")
	private String name;
	private String category;
	
	@NotEmpty(message="Description can not be empty.")
	@Size(min=2,message="Description must contain minimum 2 letters")
	@Size(max=30,message="Description must contain maximum 30 letters")
	private String description;
	
	@NotEmpty(message="Address can not be empty.")
	@Size(min=2,message="Address must contain minimum 2 letters")
	@Size(max=30,message="Address must contain maximum 30 letters")
	private String address;
	
	@NotEmpty(message="Phone number can not be empty.")
	@Size(max=30,message="Phone number is too long")
	private String contact;
	
	@NotEmpty(message="City can not be empty.")
	@Size(min=2,message="City must contain minimum 2 letters")
	@Size(max=30,message="City must contain maximum 30 letters")
	private String city;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Feature(Integer id,String name,String category,String description,String address,String contact,String city) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.description = description;
		this.address = address;
		this.contact = contact;
		this.city = city;
	}
	
	public Feature() {}
	
	
	
	
	
}
