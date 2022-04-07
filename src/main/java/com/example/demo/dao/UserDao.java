package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserDao extends JpaRepository<User, Long> {

  @Query("SELECT u FROM User u WHERE u.email = ?1")
  User findByEmail(String email);
}
