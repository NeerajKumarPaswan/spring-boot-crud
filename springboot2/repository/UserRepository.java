package com.ty.springboot2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ty.springboot2.dto.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
