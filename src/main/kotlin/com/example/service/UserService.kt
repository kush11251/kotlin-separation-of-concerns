package com.example.service
import com.example.repository.UserRepository
class UserService(private val userRepository: UserRepository) {
    fun getUser(): String {
        return userRepository.getUser()
    }
}