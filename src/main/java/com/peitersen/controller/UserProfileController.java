package com.peitersen.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.peitersen.domain.UserProfile;

@RestController
public class UserProfileController {

	@RequestMapping("/userprofile")
	public UserProfile byId(
			@RequestParam String uuidStr
	) {
		return new UserProfile(UUID.fromString(uuidStr), "Dennis Peitersen2");
	}

}
