package com.argz.module

import androidx.test.core.app.ActivityScenario
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test // This will fail with the above stacktrace
    fun activityScenario() {
        ActivityScenario.launch(MainActivity::class.java).use {
            print(0)
        }
    }

    @Test // This worked fine
    fun nonActivityScenario() {
        print(0)
    }
}