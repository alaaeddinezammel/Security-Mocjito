package com.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.entites.AppUser;

@Repository

public interface AppUserRepo extends JpaRepository<AppUser, Long> {
	public AppUser findByUsername(String username);
}
