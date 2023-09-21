package com.example.hiltdemo

import android.util.Log
import javax.inject.Inject

const val TAG = "UserRepo"

public interface UserRepo {
    fun saveUser(email: String, password: String)
}

class SQLRepo @Inject constructor() : UserRepo {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: $email, $password" + "Saved in SQL")
    }
}

class FirebaseRepo : UserRepo {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser: $email, $password" +"Saved in Firebase")
    }
}