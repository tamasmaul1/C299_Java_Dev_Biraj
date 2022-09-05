package com.example.demo;

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

}
