package com.stk.helloime

import android.inputmethodservice.InputMethodService
import android.view.View

/**
 * Created by stk on 2017/05/18.
 */

class HelloIME : InputMethodService() {
    override fun onCreateInputView(): View {
        val helloIMEView = layoutInflater.inflate(R.layout.input, null) as HelloIMEView
        helloIMEView.setIME(this)
        return helloIMEView
    }

    fun input(s: String) {
        currentInputConnection.commitText(s, 1) // 入力貼り付け
    }
}
