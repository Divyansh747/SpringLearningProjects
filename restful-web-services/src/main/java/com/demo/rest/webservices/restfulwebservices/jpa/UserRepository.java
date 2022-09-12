package com.demo.rest.webservices.restfulwebservices.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.rest.webservices.restfulwebservices.user.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
