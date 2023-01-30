package com.ty.springboot2.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.springboot2.dto.User;
import com.ty.springboot2.repository.UserRepository;

@Repository
public class UserDao {
   @Autowired
	UserRepository userRepository;
   //save user
   public User saveUser(User user) {
	return   userRepository.save(user);
   }
   //get All user
   public List<User> getAllUsers(){
	   return userRepository.findAll();
   }
   //get by Id
   public User getUserById(int id) {
	  Optional<User> opt= userRepository.findById(id);
	  if(opt.isEmpty()) {
		  return null;
	  }else {
		  return opt.get();
	  }
   }
   
   //delete by id
   public boolean deleteUserById(int id) {
	   Optional<User> optional= userRepository.findById(id);
	   if(optional.isPresent()) {
		   userRepository.delete(optional.get());
		   return true;
	   }else {
		   return false;
	   }
   }
   
   //update user
   public User updateUserById(int id, User user) {
		Optional<User> optional = userRepository.findById(id);
		if (optional.isPresent()) {
			return userRepository.save(user);
		} else {
			return null;
		}
	}
}
