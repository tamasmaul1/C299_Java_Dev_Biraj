package com.example.demo.appUser;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.java.Log;

@Log
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

	@Override
	public boolean deleteAppUser(Long id) {

		boolean deleteFlag = false;
		try {
			appUserRepository.deleteById(id);
			deleteFlag = true;

		} catch (Exception e) {
			log.info(e.getMessage());
		}
		return deleteFlag;

	}

	@Override
	public AppUser updateAppUser(AppUser appUser) {
		
		//Logic to sanitize the incoming data 
		//Create Util Class and implement Logic. 
		appUserRepository.save(appUser);
		return null;
	}

}