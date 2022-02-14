package com.example.simplequiz.di

import android.app.Application
import com.example.simplequiz.data.QuizRepository
import com.example.simplequiz.data.QuizRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object AppModule {

    @Singleton
    @Provides
    fun provideRepository(quizRepositoryImpl: QuizRepositoryImpl): QuizRepository = quizRepositoryImpl
    

}