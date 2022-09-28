package com.example.films.data.network.utils

sealed class Result<T>(val message:String? = null, val data:T? = null){
    class Error<T>(message: String):Result<T>(message = message)
    class Loading<T>:Result<T>()
    class Success<T>(data: T?):Result<T>(data = data)
}