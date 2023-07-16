package az.demo.smartcity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.demo.smartcity.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
