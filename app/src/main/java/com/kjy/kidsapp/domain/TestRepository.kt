package com.kjy.kidsapp.domain

import com.kjy.kidsapp.data.TestDto
import retrofit2.Response

interface TestRepository {
    suspend fun getAdvice(): Response<TestDto>

    suspend fun getBookInfo(): Response<>
}