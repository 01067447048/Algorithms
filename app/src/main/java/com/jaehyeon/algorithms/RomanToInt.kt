package com.jaehyeon.algorithms

class Solution {
    fun romanToInt(s: String): Int {
        val reverseString = s.reversed()
        var result = 0
        var temp = 0

        for (ch in reverseString) {

            val currentValue = when (ch) {
                'I' -> 1
                'V' -> 5
                'X' -> 10
                'L' -> 50
                'C' -> 100
                'D' -> 500
                'M' -> 1000
                else -> throw Throwable()
            }

            if (temp > currentValue) {
                result -= currentValue
            } else {
                result += currentValue
            }

            temp = currentValue
        }

        return result
    }
}


fun main() {
    val sol = Solution()
    println(sol.romanToInt("MCMXCIV"))
}