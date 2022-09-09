package com.example.demo.appUser;

import java.util.List;
import java.util.Optional;


public interface AppUserService {

	Optional<AppUser> findAppUser(Long id);

	List<AppUser> getAppUsers();

	AppUser createAppUser(AppUser appUser);
	
	AppUser updateAppUser(AppUser appUser);
	
	boolean deleteAppUser(Long id);
	
	// Delete -> AppUser based on ID.
	
	// Update -> AppUser Details based on the ID
	
}
