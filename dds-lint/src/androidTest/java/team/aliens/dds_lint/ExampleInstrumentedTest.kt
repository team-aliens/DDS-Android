/*
 * Designed and developed by Team Aliens, 2023
 *
 * Licensed under the MIT.
 * Please see full license: https://github.com/team-aliens/DDS-Android/blob/develop/LICENSE
 */

package team.aliens.dds_lint

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
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("team.aliens.dds_lint.test", appContext.packageName)
    }
}