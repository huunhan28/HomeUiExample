package com.example.myapplication
import com.google.gson.GsonBuilder

class Utils{
    companion object{
        inline fun <reified T> jsonToObject(jsonString: String?): T? {
            var jObject: T? = null

            try {
                var gson = GsonBuilder().create()
                jObject = gson.fromJson(jsonString, T::class.java)
            } catch (e: Exception) {
                jObject = null
            }

            return jObject
        }
    }
}