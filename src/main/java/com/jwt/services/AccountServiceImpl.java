package com.jwt.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.jwt.dao.AppRoleRepo;
import com.jwt.dao.AppUserRepo;
import com.jwt.entites.AppRole;
import com.jwt.entites.AppUser;

@Service
@Transactional
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AppUserRepo userRepository;
	@Autowired
	private AppRoleRepo roleRepository;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public AppUser saveUser(AppUser u) {
		u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));
		return userRepository.save(u);
	}

	@Override
	public AppRole saveRole(AppRole r) {
		return roleRepository.save(r);
	}

	@Override
	public AppUser findUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public void addRoleToUser(String username, String roleName) {
		AppUser user = userRepository.findByUsername(username);
		AppRole role = roleRepository.findByRole(roleName);
		user.getRoles().add(role);
	}
}
