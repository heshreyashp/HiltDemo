package com.example.hiltdemo

import android.app.Activity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@InstallIn(ActivityComponent::class)
@Module
class UserModule {


    @Provides
    @Named("sql")
    fun provideUserRepo(sqlRepo: SQLRepo): UserRepo{
        return SQLRepo()
    }

    @Provides
    @Named("firebase")
    fun provideFirebaseUserRepo(): UserRepo{
        return FirebaseRepo()
    }
}