package com.lol.playtime

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class LeagueController {

    @GetMapping()
    fun test(): String {
        return "Hallo Welt"
    }
}