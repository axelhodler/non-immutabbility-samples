package co.hodler.immutability;

import java.util.List;

import static java.util.Arrays.asList;

public class JavaImmutabilityExample {

	private List<String> allowedUsers = asList("Alice", "Bob", "Charlie");

	public List<String> getAllowedUsers() {
		return allowedUsers;
	}

	public boolean canUserAccessResource(String username) {
		return this.getAllowedUsers().contains(username);
	}
}
