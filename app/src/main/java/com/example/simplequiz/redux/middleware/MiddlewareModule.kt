package com.example.simplequiz.redux.middleware

import com.example.simplequiz.api.QuizApi
import com.example.simplequiz.api.RetroFitApi
import com.example.simplequiz.data.QuizRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object MiddlewareModule {

    @Provides
    fun provideDataStore(quizRepository: QuizRepository) = DataStore(quizRepository)
}
