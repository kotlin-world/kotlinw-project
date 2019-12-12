package kotlinw.example.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
class TravelAppServerApplication

fun main(args: Array<String>) {
    runApplication<TravelAppServerApplication>(*args)
}
