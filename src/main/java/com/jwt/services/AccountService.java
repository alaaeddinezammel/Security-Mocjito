package com.jwt.services;

import org.springframework.stereotype.Repository;

import com.jwt.entites.AppRole;
import com.jwt.entites.AppUser;

@Repository
public interface AccountService {
	public AppUser saveUser(AppUser u);

	public AppRole saveRole(AppRole r);

	public AppUser findUserByUsername(String username);

	public void addRoleToUser(String username, String role);
}
