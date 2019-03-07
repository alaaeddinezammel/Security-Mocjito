package com.jwt.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.entites.AppRole;

@Repository
public interface AppRoleRepo extends JpaRepository<AppRole, Long> {
	public AppRole findByRole(String role);
}
