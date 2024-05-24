package com.plcoding.e_book.util

object Constants {
    const val USER_SETTINGS = "userSetting"

    const val APP_ENTRY = "appEntry"

    const val BASE_URL = "https://bookstorebackend-production-7f54.up.railway.app/BookStore/"

    const val BOOKS_DATABASE_NAME = "books_db"

    const val CATEGORY_DATABASE_NAME = "category_db"

    var USER_TOKEN = ""


    fun getToken(): String {
        return USER_TOKEN
    }

    fun setToken(NewToken: String){
        USER_TOKEN = NewToken
    }
}