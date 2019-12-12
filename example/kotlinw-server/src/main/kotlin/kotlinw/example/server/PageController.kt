package kotlinw.example.server

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class PageController {
    @GetMapping("/*")
    @ResponseBody
    fun renderPage() =
            """
                <!DOCTYPE html>
                <html>
                <head>
                    <title>Kotlin-World</title>
                    <meta charset="utf-8"/>
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                </head>
                <body>
                <div id="container"></div>
                <script src="/kotlinw-webapp.js"></script>
                </body>
                </html>
            """.trimIndent()
}
