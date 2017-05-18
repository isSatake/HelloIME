package com.stk.helloime

import android.graphics.Canvas
import android.view.MotionEvent
import android.view.View
import android.content.Context
import android.util.AttributeSet

/**
 * Created by stk on 2017/05/18.
 */

class HelloIMEView(context: Context, attrs: AttributeSet): View(context, attrs) {
    var helloIME: HelloIME? = null

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(0xffe0e0e0.toInt())
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        setMeasuredDimension(widthMeasureSpec, 200)
    }

    override fun onTouchEvent(ev: MotionEvent): Boolean {
        if (ev.action and MotionEvent.ACTION_MASK == MotionEvent.ACTION_DOWN) {
            helloIME?.input("Hello Kotlin!! ")
        }
        return true
    }

    fun setIME(_helloIME: HelloIME) {
        helloIME = _helloIME
    }
}
