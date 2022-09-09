package com.jaehyeon.algorithms

import kotlin.math.max

class TheNumberOfWeakCharInTheGame {

    fun numberOfWeakCharacters(properties: Array<IntArray>): Int {
        properties.sortWith(compareBy<IntArray>{ -it[0] }.thenBy{ it[1] })

        var mx = 0
        var ans = 0
        properties.forEach { p ->
            if(p[1] < mx) ans++
            mx = max(mx, p[1])
        }

        return  ans
    }
}

fun main() {

}