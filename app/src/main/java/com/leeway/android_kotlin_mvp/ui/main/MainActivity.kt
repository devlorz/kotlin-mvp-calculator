package com.leeway.android_kotlin_mvp.ui.main

import android.os.Bundle
import com.leeway.android_kotlin_mvp.R
import com.leeway.android_kotlin_mvp.ui.base.BaseActivity
import javax.inject.Inject

class MainActivity : BaseActivity(), MainContract.View {

    @Inject
    lateinit var mainPresenter: MainContract.Presenter<MainContract.View>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        activityComponent.inject(this)
        mainPresenter.onAttach(this)
        setUp()
    }

    override fun onDestroy() {
        mainPresenter.onDetach()
        super.onDestroy()
    }

    override fun setUp() {

    }
}
