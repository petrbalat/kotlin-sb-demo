package cz.kotlingroup.sbdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SbDemoApplication

fun main(args: Array<String>) {
    runApplication<SbDemoApplication>(*args)
}
