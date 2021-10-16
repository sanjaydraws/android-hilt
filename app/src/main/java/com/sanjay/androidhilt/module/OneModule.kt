package com.sanjay.androidhilt.module

import android.app.Application
import com.sanjay.androidhilt.interfaces.One
import com.sanjay.androidhilt.models.OneImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class OneModule{
    @Binds
    @Singleton
    abstract fun getOne(oneImple:OneImpl):One
}