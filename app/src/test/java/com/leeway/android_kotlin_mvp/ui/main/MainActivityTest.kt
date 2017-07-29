package com.leeway.android_kotlin_mvp.ui.main

import com.leeway.android_kotlin_mvp.BuildConfig
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.MockitoAnnotations
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.android.controller.ActivityController
import org.robolectric.annotation.Config
import org.junit.Assert.assertThat
import org.hamcrest.core.Is.`is`
import org.hamcrest.Matchers.notNullValue
import org.mockito.Mockito.verify

/**
 * Created by Lee Lorz on 7/29/2017.
 */

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class,
        sdk = intArrayOf(21))
class MainActivityTest {
    lateinit var activityController: ActivityController<MainActivity>
    lateinit var activity: MainActivity

    @Before
    @Throws(Exception::class)
    fun setup() {
        MockitoAnnotations.initMocks(this)
        activityController = Robolectric.buildActivity(MainActivity::class.java).create()
        activity = activityController.get()
    }

    @Test
    @Throws(Exception::class)
    fun testActivityIsNotNull() {
        assertThat(activity, `is`(notNullValue()))
    }

    @Test
    @Throws(Exception::class)
    fun testOnCreate() {
        verify(activity.mainPresenter).onAttach(activity)
    }
}