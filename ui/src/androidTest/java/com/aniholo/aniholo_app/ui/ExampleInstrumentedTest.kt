package com.aniholo.aniholo_app.ui

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @Test
    fun testPackageName() {
        // arrange
        val expectedPackageName = "com.aniholo.aniholo_app.ui.test"
        val appContext = ApplicationProvider.getApplicationContext<Context>()

        // act
        val actualPackageName = appContext.packageName

        // assert
        assertEquals(expectedPackageName, actualPackageName)
    }
}
