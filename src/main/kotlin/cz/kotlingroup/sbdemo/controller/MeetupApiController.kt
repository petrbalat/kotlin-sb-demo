package cz.kotlingroup.sbdemo.controller

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import java.util.*
import javax.persistence.Entity
import javax.persistence.Id

@RestController
@RequestMapping("/api/kotlin/meetup")
class KotlinMeetupApiController(val repository: KotlinMeetupRepository) {

    @GetMapping
    fun get(): List<KotlinMeetup> = repository.findAll()

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Int): KotlinMeetup? = repository.findById(id).orElse(null)
}

@Entity(name = "kotlin_meetup")
class KotlinMeetup {

    @Id
    var id: Int = 0

    var name: String? = null

    var start: LocalDateTime = LocalDateTime.now()

}

@Repository
interface KotlinMeetupRepository : JpaRepository<KotlinMeetup, Int>
