package com.leeway.android_kotlin_mvp.ui.main

import com.leeway.android_kotlin_mvp.data.DataManager
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.Schedulers
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.Mockito.verify

/**
 * Created by Lee Lorz on 7/27/2017.
 */

@RunWith(MockitoJUnitRunner::class)
class MainPresenterTest {

    @Mock
    lateinit var mainView: MainContract.View

    @Mock
    lateinit var dataManager: DataManager

    lateinit var mainPresenter: MainPresenter<MainContract.View>

    val mockCurrentValue = "1000"

    @Before
    @Throws(Exception::class)
    fun setup() {
        MockitoAnnotations.initMocks(this)
        val compositeDisposable = CompositeDisposable()
        mainPresenter = MainPresenter(dataManager, compositeDisposable)
        mainPresenter.onAttach(mainView)

        RxJavaPlugins.setIoSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setComputationSchedulerHandler { Schedulers.trampoline() }
        RxJavaPlugins.setNewThreadSchedulerHandler { Schedulers.trampoline() }
        RxAndroidPlugins.setInitMainThreadSchedulerHandler { Schedulers.trampoline() }
    }

    @Test
    fun testCalZeroPress() {
        mainPresenter.onCalZeroPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "0")
    }

    @Test
    fun testCalOnePress() {
        mainPresenter.onCalOnePress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "1")
    }

    @Test
    fun testCalTwoPress() {
        mainPresenter.onCalTwoPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "2")
    }

    @Test
    fun testCalThreePress() {
        mainPresenter.onCalThreePress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "3")
    }

    @Test
    fun testCalFourPress() {
        mainPresenter.onCalFourPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "4")
    }

    @Test
    fun testCalFivePress() {
        mainPresenter.onCalFivePress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "5")
    }

    @Test
    fun testCalSixPress() {
        mainPresenter.onCalSixPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "6")
    }

    @Test
    fun testCalSevenPress() {
        mainPresenter.onCalSevenPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "7")
    }

    @Test
    fun testCalEightPress() {
        mainPresenter.onCalEightPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "8")
    }

    @Test
    fun testCalNinePress() {
        mainPresenter.onCalNinePress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "9")
    }
}