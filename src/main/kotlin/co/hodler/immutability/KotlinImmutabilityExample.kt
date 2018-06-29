package co.hodler.immutability

class KotlinImmutabilityExample {

    val allowedUsers = listOf("Alice", "Bob", "Charlie")

    fun canUserAccessResource(username: String): Boolean {
        return this.allowedUsers.contains(username)
    }
}
