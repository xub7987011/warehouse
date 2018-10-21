package com.example.demothree.jpa;

import com.example.demothree.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface UserJpa extends JpaRepository<UserEntity,Long> , JpaSpecificationExecutor<UserEntity>, Serializable {
}
