package az.demo.smartcity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import az.demo.smartcity.model.AuthorityModel;

public interface AuthorityRepository extends JpaRepository<AuthorityModel, Integer>{

}
