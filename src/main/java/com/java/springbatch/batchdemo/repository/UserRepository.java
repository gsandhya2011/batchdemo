package com.java.springbatch.batchdemo.repository;

import com.java.springbatch.batchdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
