package co.hodler.immutability;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JavaImmutabilityExampleTest {

	JavaImmutabilityExample subject = new JavaImmutabilityExample();

	@Test
	public void charlie_can_access_the_resource() {
		assertThat(subject.canUserAccessResource("Charlie")).isTrue();
	}

	@Test
	public void mallory_cant_directly_access_the_resource() {
		assertThat(subject.canUserAccessResource("Mallory")).isFalse();
	}

	@Test
	public void mallory_can_be_added_to_the_allowed_users() {
		subject.getAllowedUsers().set(0, "Mallory");

		assertThat(subject.canUserAccessResource("Mallory")).isTrue();
	}
}