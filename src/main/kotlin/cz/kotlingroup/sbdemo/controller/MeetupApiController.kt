package cz.kotlingroup.sbdemo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

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
}

class KotlinMeetup {

    var id: Int = 0

    lateinit var name: String

    var date: LocalDateTime = LocalDateTime.now()

}
