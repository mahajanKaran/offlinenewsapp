package com.karan.newsapp.common.util

object ValidationUtil {

    fun checkIfValidArgNews(str: String?): Boolean {
        return !(str.isNullOrEmpty() || str == "{country}" || str == "{language}" || str == "{source}")
    }

}