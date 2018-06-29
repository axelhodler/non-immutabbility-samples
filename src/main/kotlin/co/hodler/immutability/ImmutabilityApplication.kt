package co.hodler.immutability

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ImmutabilityApplication

fun main(args: Array<String>) {
    runApplication<ImmutabilityApplication>(*args)
}
