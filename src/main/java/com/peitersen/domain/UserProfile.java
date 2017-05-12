package com.peitersen.domain;

import java.util.UUID;

/**
 * TODO: POJO DESCRIPTION GOES HERE
 *
 * */
public class UserProfile {

	private final UUID uuid;
	private final String name;

	public UserProfile(
			final UUID uuid,
			final String name
	) {
		this.uuid = uuid;
		this.name = name;
	}

	public UUID getUuid() {
		return uuid;
	}

	public String getName() {
		return name;
	}
}
