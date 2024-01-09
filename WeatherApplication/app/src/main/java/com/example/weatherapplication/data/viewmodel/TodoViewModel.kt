package com.example.weatherapplication.data.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.weatherapplication.data.models.APIService
import com.example.weatherapplication.data.models.Todo
import kotlinx.coroutines.launch

class TodoViewModel:ViewModel() {
    private val _todoList = mutableStateListOf<Todo>()
    var errorMessage: String by mutableStateOf("")

    val todoList: List<Todo>
        get() = _todoList

    fun getTodoList() {
        viewModelScope.launch {
            val apiService = APIService.getInstance()
            try {
                _todoList.clear()
                _todoList.addAll(apiService.getTodos())

            } catch (e: Exception) {
                errorMessage = e.message.toString()
            }
        }
    }
}