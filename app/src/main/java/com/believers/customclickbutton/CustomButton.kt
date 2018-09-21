package com.believers.customclickbutton

import android.content.Context
import android.support.v7.widget.AppCompatButton
import android.util.AttributeSet


class CustomButton(context: Context?, attrs: AttributeSet?) : AppCompatButton(context, attrs) {


    private var backgroundPressed = -1
    private var backgroundDefault = -1
    private  var isEnabel = false

    override fun setPressed(pressed: Boolean) {
        super.setPressed(pressed)
        if (pressed){

            if (backgroundPressed != -1){
                setBackgroundResource(backgroundPressed)
            }else{
                scaleX = 0.8f
                scaleY = 0.8f
            }

        }else{

            if (backgroundPressed != -1) {
                setBackgroundResource(backgroundDefault)

            }else{
                scaleX = 1.0f
                 scaleY = 1.0f
            }
        }
    }

fun setBackgroundCustom(default:Int,pressed:Int){

    this.backgroundDefault = default
    this.backgroundPressed = pressed

}


}







































