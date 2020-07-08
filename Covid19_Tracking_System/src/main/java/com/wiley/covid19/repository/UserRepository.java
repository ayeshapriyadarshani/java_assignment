package com.wiley.covid19.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiley.covid19.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String userName);
}