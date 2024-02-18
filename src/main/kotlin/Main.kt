package org.example

private const val REQUEST_CITY_MESSAGE = "Enter your city…"

fun main() {
    println(REQUEST_CITY_MESSAGE)
    val userCity = readln()
    println("User lives in $userCity")
}