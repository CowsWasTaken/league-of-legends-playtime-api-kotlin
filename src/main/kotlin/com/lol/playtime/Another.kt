package com.lol.playtime

import jakarta.persistence.*

@Entity
data class Person(
    @Column(nullable = false)
    val name: String,

//    ID at the end because its auto generated and optional for creation
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int?=null,
)
