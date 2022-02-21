package com.minsur.epphelper.model


import androidx.compose.runtime.Composable
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.*
import okio.IOException


data class User(val id: Int,
                val document:String,
                val email:String,
                val names: String,
                val paternal_surname: String,
                val maternal_surname: String
                )

private val client = OkHttpClient()

var mainUser: User? = null

fun getUser(dni: String, then: ((User?) -> Unit)){
    val request = Request.Builder()
        .url("http://20.197.190.239:8000/api/users/$dni")
        //.url("http://10.0.2.2:8000/api/users/$dni")
        .build()

    client.newCall(request).enqueue(object : Callback {
        override fun onFailure(call: Call, e: IOException) {
            e.printStackTrace()
        }

        override fun onResponse(call: Call, response: Response) {
            response.use {
                var res: User? = null
                if (!response.isSuccessful) {
                    then(res)
                    throw IOException("Unexpected code $response")
                }

                for ((name, value) in response.headers) {
                    println("$name: $value")
                }

                val body = response.body?.string();

                val gson = GsonBuilder().create()
                res = gson.fromJson(body, User::class.java)
                //APIToken.getInstance().put(APIToken.Key.API_TOKEN, res.token)
                then(res)
            }
        }

    })

}