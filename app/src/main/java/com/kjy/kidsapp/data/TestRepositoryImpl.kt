package com.kjy.kidsapp.data

import com.kjy.kidsapp.domain.TestRepository
import com.kjy.kidsapp.util.Const
import retrofit2.Response
import javax.inject.Inject


class TestRepositoryImpl @Inject constructor(
    private val testApi: TestApi
) : TestRepository {
    override suspend fun getAdvice(): Response<TestDto> {
        return testApi.getAdvice()
    }
}