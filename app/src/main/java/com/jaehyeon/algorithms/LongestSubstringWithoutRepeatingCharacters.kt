package com.jaehyeon.algorithms

class LongestSubstringWithoutRepeatingCharacters {
    fun lengthOfLongestSubstring(s: String): Int {
        var tmp = ""
        var max  = 0

        //pwwkew

        s.forEach { ch->
            if (tmp.contains(ch)){
                tmp = tmp.takeLastWhile {it != ch}
                println(tmp)
            }

            tmp += ch

            if (tmp.length > max){
                max = tmp.length
            }
        }

        return max
    }
}

fun main() {
    println(LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwke"))
}