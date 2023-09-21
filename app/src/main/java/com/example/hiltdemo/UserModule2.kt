package com.example.hiltdemo;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityComponent;

//@InstallIn(ActivityComponent::class)
//@Module
class UserModule2 {


    //@Provides
    fun provideUserRepo(): UserRepo{
        return FirebaseRepo()
    }
}