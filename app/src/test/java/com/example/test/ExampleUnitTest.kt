package com.example.test

import android.content.SharedPreferences
import android.provider.Settings.Global.putString
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun a() {
        val b = B()
        println(b.a.aa())
    }
}


fun edit(
    sp: SharedPreferences,
    commit: Boolean = false,
    action: (SharedPreferences.Editor) -> Unit
) {
    val editor = sp.edit()
    action(editor)
    if (commit) {
        editor.commit()
    } else {
        editor.apply()
    }
}

const val KEY_STRING = "key_string"

class PreferenceManager(private val sharedPreferences: SharedPreferences) {
    fun saveToken(token: String) {
        edit(sharedPreferences,
            false,
            {
                it.putString(KEY_STRING, token)
            }
        )
    }
}

inline fun f(crossinline body: () -> Unit) {
    val f = object : Runnable {
        override fun run() = body()
    }
    // ...
}

