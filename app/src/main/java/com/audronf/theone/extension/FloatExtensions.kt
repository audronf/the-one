package com.audronf.theone.extension

import java.text.DecimalFormat

fun Float.toFormattedAmount(): String {
    return try {
        val decimalFormat = DecimalFormat("#.#")
        decimalFormat.format(this)
    } catch (e: Exception) {
        this.toString()
    }
}
