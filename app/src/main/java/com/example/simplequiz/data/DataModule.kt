package com.example.simplequiz.data

import com.example.simplequiz.api.QuizApi
import com.example.simplequiz.api.RetroFitApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    fun provideQuizApi(): QuizApi  =  RetroFitApi.getInstance().create(QuizApi::class.java)


}