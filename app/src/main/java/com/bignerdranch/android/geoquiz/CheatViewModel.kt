package com.bignerdranch.android.geoquiz

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

const val ANSWER_IS_TRUE_KEY = "ANSWER_IS_TRUE"
const val USER_CHEATED_KEY = "USER_CHEATED_KEY"

class CheatViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var userCheated: Boolean
        get() = savedStateHandle[USER_CHEATED_KEY] ?: false
        set(value) = savedStateHandle.set(USER_CHEATED_KEY, value)

    var answerIsTrue: Boolean
        get() = savedStateHandle[ANSWER_IS_TRUE_KEY] ?: false
        set(value) = savedStateHandle.set(ANSWER_IS_TRUE_KEY, value)

}