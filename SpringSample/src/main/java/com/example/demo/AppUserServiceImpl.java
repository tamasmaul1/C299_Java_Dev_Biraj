package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	private AppUserRepository appUserRepository;

	public void createAppUser(AppUser tempAppUser) {

		System.out.println("createAppUser");
		appUserRepository.save(tempAppUser);
	}
	
	@Override
	public Optional<AppUser> findAppUser(Long id) {
		
		return appUserRepository.findById(id);
		
	}

	@Override
	public void createAppUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AppUser> getAppUsers() {
		
		return (List<AppUser>) appUserRepository.findAll();
		
	}


}
