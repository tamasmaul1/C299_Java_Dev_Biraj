package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

	@Autowired
	private AppUserRepository appUserRepository;

	@Override
	public Optional<AppUser> findAppUser(Long id) {

		return appUserRepository.findById(id);

	}

	@Override
	public AppUser createAppUser(AppUser tempAppUser) {
		// TODO Auto-generated method stub
		System.out.println("createAppUser");
		return appUserRepository.save(tempAppUser);
	}

	@Override
	public List<AppUser> getAppUsers() {

		return (List<AppUser>) appUserRepository.findAll();

	}

}
