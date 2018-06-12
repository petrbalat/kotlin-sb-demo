package cz.kotlingroup.sbdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.util.*

@RestController
@RequestMapping("/api/kotlin/meetup")
class KotlinMeetupApiController {

    @GetMapping
    fun get(): List<KotlinMeetup> {
        val today = KotlinMeetup().apply {
            this.id = 1
            this.name = "native and spring boot"
        }
        return listOf(today)
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id:Int): KotlinMeetup? = KotlinMeetup().apply {
        this.id = id
        this.name = UUID.randomUUID().toString()
    }
}

class KotlinMeetup {

    var id: Int = 0

    lateinit var name: String

    var date: LocalDateTime = LocalDateTime.now()

}
