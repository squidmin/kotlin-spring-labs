package org.squidmin.kotlinspringlabs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringLabsApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringLabsApplication>(*args)
}
