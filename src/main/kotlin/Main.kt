package ru.netology

fun main() {

    val likes = 1
    var people = "человеку"

    if (likes % 100 == 11 || likes % 10 != 1) people = "людям"

    println("Понравилось $likes $people")
}