package com.springjpaeducandoweb.springjpacourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springjpaeducandoweb.springjpacourse.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
