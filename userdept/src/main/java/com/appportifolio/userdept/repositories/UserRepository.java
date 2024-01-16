package com.appportifolio.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appportifolio.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
