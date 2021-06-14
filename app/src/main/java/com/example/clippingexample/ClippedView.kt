package com.example.clippingexample

import android.content.Context
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class ClippedView @JvmOverloads constructor(
    context: Context,
    attributes: AttributeSet? = null,
    defStyleAttr: Int = 0): View(context, attributes, defStyleAttr){

        private val paint = Paint().apply {
            // Smooth out edges of what is drawn
            isAntiAlias = true
            strokeWidth = resources.getDimension(R.dimen.strokeWidth)
            textSize = resources.getDimension(R.dimen.textSize)
        }

    private val path = Path()
}
