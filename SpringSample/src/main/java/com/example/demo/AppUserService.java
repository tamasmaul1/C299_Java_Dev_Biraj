package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface AppUserService {

	public void createAppUser();

	Optional<AppUser> findAppUser(Long id);

	List<AppUser> getAppUsers();
}
