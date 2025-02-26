package com.kjy.kidsapp.data

import retrofit2.Response
import retrofit2.http.GET

interface TestApi {
    @GET("/advice")
    suspend fun getAdvice() : Response<TestDto>
}