package com.sanjay.androidhilt.module

import android.app.Application
import com.sanjay.androidhilt.interfaces.One
import com.sanjay.androidhilt.models.OneImpl
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton


//to provide interface
/*
@Module
@InstallIn(SingletonComponent::class)
abstract class OneModule{
    @Binds
    @Singleton
    abstract fun getOne(oneImpl:OneImpl):One
}
*/
//=====================================================

// another way to provide interface

@Module
@InstallIn(SingletonComponent::class)
class OneModuleAnother{

    // provide string dependency r
    @Provides
    @FName
    fun getFName():String = "Sanjay "

    @Provides
    @LName
    fun getLName():String = "Prajapat "


    @Provides
    @Singleton
    fun getOne(
       @FName fName:String,
       @LName lName:String,
    ):One = OneImpl(fName,lName)
}


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName



