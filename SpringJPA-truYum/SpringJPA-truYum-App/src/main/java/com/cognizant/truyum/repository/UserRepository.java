package com.cognizant.truyum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.truyum.model.User;
/**
 * 
 * @author AKSHITA SRIVASTAVA
 *UserRepoistory extends JPARepository
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
}