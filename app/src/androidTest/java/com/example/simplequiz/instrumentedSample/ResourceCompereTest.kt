package com.example.simplequiz.instrumentedSample

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.simplequiz.R
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class ResourceCompereTest {

    private lateinit var resourceCompere: ResourceCompere

    @Before
    fun setup() {
        resourceCompere = ResourceCompere()
    }

    @Test
    fun isEqual_returnsTrue() {
        // Arrange
        val context = ApplicationProvider.getApplicationContext<Context>()

        // Act
        val result = resourceCompere.isEqual(context, R.string.app_name, "SimpleQuiz")

        // Assert
        assertTrue(result)
    }

    @Test
    fun isEqual_returnsFalse() {
        // Arrange
        val context = ApplicationProvider.getApplicationContext<Context>()

        // Act
        val result = resourceCompere.isEqual(context, R.string.app_name, "NotSoSimpleQuiz")

        // Assert
        assertFalse(result)
    }
}