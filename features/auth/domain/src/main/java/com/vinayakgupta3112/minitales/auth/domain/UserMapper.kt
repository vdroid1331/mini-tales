package com.vinayakgupta3112.minitales.auth.domain

import com.vinayakgupta3112.minitales.auth.data.UserApiModel
import javax.inject.Inject

class UserMapper @Inject constructor(

) : Mapper<UserApiModel, User> {
    override fun map(from: UserApiModel): User {
        return User(
            avatar = from.avatar,
            email = from.email,
            createdAt = from.createdAt,
            fullName = from.fullName,
            id = from.id,
        )
    }
}