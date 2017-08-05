package com.leeway.android_kotlin_mvp.ui.main

import com.leeway.android_kotlin_mvp.data.DataManager
import com.leeway.android_kotlin_mvp.ui.base.BasePresenter
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by Lee Lorz on 7/15/2017.
 */
class MainPresenter<V: MainContract.View>
@Inject
constructor(dataManager: DataManager,
            compositeDisposable: CompositeDisposable) :
        BasePresenter<V>(dataManager, compositeDisposable), MainContract.Presenter<V> {
    override fun onCalCPress() {
        mvpView!!.setCurrentValue("0")
    }

    override fun onCalZeroPress(currentAmount: String) {
        setCalValue(currentAmount, "0")
    }

    override fun onCalOnePress(currentAmount: String) {
        setCalValue(currentAmount, "1")
    }

    override fun onCalTwoPress(currentAmount: String) {
        setCalValue(currentAmount, "2")
    }

    override fun onCalThreePress(currentAmount: String) {
        setCalValue(currentAmount, "3")
    }

    override fun onCalFourPress(currentAmount: String) {
        setCalValue(currentAmount, "4")
    }

    override fun onCalFivePress(currentAmount: String) {
        setCalValue(currentAmount, "5")
    }

    override fun onCalSixPress(currentAmount: String) {
        setCalValue(currentAmount, "6")
    }

    override fun onCalSevenPress(currentAmount: String) {
        setCalValue(currentAmount, "7")
    }

    override fun onCalEightPress(currentAmount: String) {
        setCalValue(currentAmount, "8")
    }

    override fun onCalNinePress(currentAmount: String) {
        setCalValue(currentAmount, "9")
    }

    private fun setCalValue(currentAmount: String, setValue: String) {
        if (currentAmount == "0") {
            if (setValue == "000") {
                mvpView!!.setCurrentValue("0")
            } else {
                mvpView!!.setCurrentValue(setValue)
            }
        } else {
            mvpView!!.setCurrentValue(currentAmount + setValue)
        }
    }
}