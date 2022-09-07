package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.java.Log;

@RestController
@Log
public class AppUserRestController {

	@Autowired
	private AppUserServiceImpl appUserServiceImpl;

	@GetMapping("/helloWorld")
	public String helloWorld() {
		return "helloWorld";
	}

	@GetMapping("/allAppUser")
	public String getAllAppUser() {
		return "helloWorld";
	}

	@GetMapping("/createAppUsers")
	public String createAppUsers(@RequestParam(value = "count", defaultValue = "1") Long count) {

		for (int i = 0; i < count; i++) {
			AppUser tempAppUser = new AppUser();
			tempAppUser.setName("Biraj");
			tempAppUser.setAddress("India");
			tempAppUser.setPhoneNumber(123456789L);

			appUserServiceImpl.createAppUser(tempAppUser);

		}

		return appUserServiceImpl.getAppUsers().toString();
	}

	@GetMapping("/AppUser")
	public Optional<AppUser> getAppUser(@RequestParam(value = "id", defaultValue = "0") Long id) {
		System.out.println(id);

		Optional<AppUser> tempAppUser = appUserServiceImpl.findAppUser(id);

		return tempAppUser;
	}

	@PostMapping("/createAppUser")
	public AppUser createAppUser(@RequestBody AppUser tempAppUser) {

		log.info(tempAppUser.toString());
		return appUserServiceImpl.createAppUser(tempAppUser);

	}

	@PostMapping("/updateAppUser")
	public AppUser updateAppUser(@RequestParam Map<String,String> allParams) {
		
		System.out.println("Parameters are " + allParams.entrySet());
		
		AppUser tempAppUser = new AppUser();
		//return appUserServiceImpl.updateAppUser();
		return tempAppUser;

	}

	@DeleteMapping("/deleteAppUser")
	public boolean deleteAppUser(@RequestParam(value = "id") Long id) {
		// Logic to delete the AppUser based on the ID.
		return appUserServiceImpl.deleteAppUser(id);

	}
}
