package cz.kotlingroup.sbdemo.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.ModelMap
import org.springframework.web.bind.annotation.GetMapping

@Controller
class IndexController(val repository: KotlinMeetupRepository) {

    @GetMapping("/")
    fun index(model: ModelMap): String {

        model["hello"] = "hello from controller"
        model["meetup"] = repository.findAll()

        return "index"
    }

}