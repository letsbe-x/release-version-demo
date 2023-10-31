package com.letsbe.releaseversion.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class EchoController {

    @GetMapping("/echo")
    fun echo(@RequestParam hello:String): String {
        return "Letsbe $hello"
    }
}
