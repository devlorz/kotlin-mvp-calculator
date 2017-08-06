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

    val mockCurrentValue = "10"
    val mockHundredValue = "100"

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
    fun testCalCPress() {
        mainPresenter.onCalCPress()
        verify(mainView).setCurrentValue("0")
    }

    @Test
    fun testCalZeroPress() {
        mainPresenter.onCalZeroPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "0")
    }

    @Test
    fun testCalZeroPressThousandValue() {
        mainPresenter.onCalZeroPress(mockHundredValue)
        verify(mainView).setCurrentValue("1,000")
    }

    @Test
    fun testCalTripleZeroPress() {
        mainPresenter.onCalTripleZeroPress(mockCurrentValue)
        verify(mainView).setCurrentValue("10,000")
    }

    @Test
    fun testCalOnePress() {
        mainPresenter.onCalOnePress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "1")
    }

    @Test
    fun testCalOnePressThousandValue() {
        mainPresenter.onCalOnePress(mockHundredValue)
        verify(mainView).setCurrentValue("1,001")
    }

    @Test
    fun testCalTwoPress() {
        mainPresenter.onCalTwoPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "2")
    }

    @Test
    fun testCalTwoPressThousandValue() {
        mainPresenter.onCalTwoPress(mockHundredValue)
        verify(mainView).setCurrentValue("1,002")
    }

    @Test
    fun testCalThreePress() {
        mainPresenter.onCalThreePress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "3")
    }

    @Test
    fun testCalThreePressThousandValue() {
        mainPresenter.onCalThreePress(mockHundredValue)
        verify(mainView).setCurrentValue("1,003")
    }

    @Test
    fun testCalFourPress() {
        mainPresenter.onCalFourPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "4")
    }

    @Test
    fun testCalFourPressThousandValue() {
        mainPresenter.onCalFourPress(mockHundredValue)
        verify(mainView).setCurrentValue("1,004")
    }

    @Test
    fun testCalFivePress() {
        mainPresenter.onCalFivePress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "5")
    }

    @Test
    fun testCalFivePressThousandValue() {
        mainPresenter.onCalFivePress(mockHundredValue)
        verify(mainView).setCurrentValue("1,005")
    }

    @Test
    fun testCalSixPress() {
        mainPresenter.onCalSixPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "6")
    }

    @Test
    fun testCalSixPressThousandValue() {
        mainPresenter.onCalSixPress(mockHundredValue)
        verify(mainView).setCurrentValue("1,006")
    }

    @Test
    fun testCalSevenPress() {
        mainPresenter.onCalSevenPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "7")
    }

    @Test
    fun testCalSevenPressThousandValue() {
        mainPresenter.onCalSevenPress(mockHundredValue)
        verify(mainView).setCurrentValue("1,007")
    }

    @Test
    fun testCalEightPress() {
        mainPresenter.onCalEightPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "8")
    }

    @Test
    fun testCalEightPressThousandValue() {
        mainPresenter.onCalEightPress(mockHundredValue)
        verify(mainView).setCurrentValue("1,008")
    }

    @Test
    fun testCalNinePress() {
        mainPresenter.onCalNinePress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + "9")
    }

    @Test
    fun testCalNinePressThousandValue() {
        mainPresenter.onCalNinePress(mockHundredValue)
        verify(mainView).setCurrentValue("1,009")
    }

    @Test
    fun testCalDotPress() {
        mainPresenter.onCalDotPress(mockCurrentValue)
        verify(mainView).setCurrentValue(mockCurrentValue + ".")
    }
}