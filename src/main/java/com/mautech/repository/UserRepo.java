package com.mautech.repository;

import com.mautech.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    public com.mautech.model.User findByEmail(String username);
}
