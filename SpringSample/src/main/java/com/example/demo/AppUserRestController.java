package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
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

}
