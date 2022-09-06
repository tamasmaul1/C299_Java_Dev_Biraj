package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface AppUserService {

	Optional<AppUser> findAppUser(Long id);

	List<AppUser> getAppUsers();

	AppUser createAppUser(AppUser appUser);
	
	AppUser updateAppUser(AppUser appUser);
	
	// Delete -> AppUser based on ID.
	
	boolean deleteAppUser(Long id);
	// Update -> AppUser Details based on the ID
	
}
