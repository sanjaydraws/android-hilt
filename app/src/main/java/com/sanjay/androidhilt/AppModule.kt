package com.sanjay.androidhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Named
import javax.inject.Singleton
import dagger.hilt.components.SingletonComponent


// in this module we will provide all application level dependencie
// like room instance or retrofit instance
//@InstallIn(ActivityComponent::class) // this depency will live as ;long as activity live
//@InstallIn(FragmentComponent::class)
//@InstallIn(ViewComponent::class) // for custom component

@Module
@InstallIn(SingletonComponent::class) // this dependency provide as long as application will live
object AppModule {

    // have central place for dependency

    @Singleton // not necessary
    @Provides  // to prvide dependency
    @Named("String1") // for multiple dependencie at same time
    fun provideTestString1()=  "we will inject String"

    @Singleton // not necessary
    @Provides  // to prvide dependency
    @Named("String2")
    fun provideTestString2()=  "we will inject another String"

}