/**
 * Project Name: Springboot-Server
 * File Name: IUserRepository.java
 * Author: Luke Bas
 * Date Started: 2022-03-26
 * Context: repository
 */

package com.spring.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.springboot.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

	
	
}
