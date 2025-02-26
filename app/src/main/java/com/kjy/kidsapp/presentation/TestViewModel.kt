package com.kjy.kidsapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.Gson
import com.kjy.kidsapp.domain.TestRepository
import com.orhanobut.logger.Logger
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class TestViewModel @Inject constructor(
    private val testRepository: TestRepository
) : ViewModel() {

    private val _testState = MutableStateFlow(TestState())
    val testState = _testState.asStateFlow()

    init {
        viewModelScope.launch {
            val result = testRepository.getAdvice()
            if (result.isSuccessful) {
                Logger.e("통신 호출 성공 ${result.body()}")
            } else {
                Logger.e("통신 호출 실패!! ${Gson().fromJson(result.errorBody().toString(), ApiError::class.java)} ${result.message()}")
            }
        }
    }
}

data class ApiError(val error: ErrorDetail)
data class ErrorDetail(val code: Int, val message: String)