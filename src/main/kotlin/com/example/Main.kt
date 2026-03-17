package com.example
import com.example.repository.UserRepository
import com.example.service.UserService
fun main() {
    val userService = UserService(UserRepository())
    println(userService.getUser())
}