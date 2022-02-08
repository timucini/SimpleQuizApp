package com.example.simplequiz.instrumentedSample

import android.content.Context

class ResourceCompere {

    fun isEqual(context: Context, resId: Int, string: String) : Boolean {
        return context.getString(resId) == string
    }
}