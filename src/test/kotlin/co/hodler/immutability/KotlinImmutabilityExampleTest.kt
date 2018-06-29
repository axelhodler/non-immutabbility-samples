package co.hodler.immutability

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class KotlinImmutabilityExampleTest {
    val subject = KotlinImmutabilityExample()

    @Test
    fun `charlie can access the resource`() {
        assertThat(subject.canUserAccessResource("Charlie")).isTrue()
    }

    @Test
    fun `mallory cant directly access the resource`() {
        assertThat(subject.canUserAccessResource("Mallory")).isFalse()
    }

    @Test
    fun `mallory can be added to the allowed users`() {
        val mutableAuthorizedUsers = subject.allowedUsers as MutableList
        mutableAuthorizedUsers[0] = "Mallory"
        assertThat(subject.canUserAccessResource("Mallory")).isTrue()
    }
}