package com.jaehyeon.algorithms

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var firstId = 0
        var secondId = 0
        for (i in nums.indices) {
            val value = target - nums[i]
            if (nums.contains(value)) {
                firstId = i
                secondId = nums.indexOf(value)
                if (secondId != firstId) {
                    break
                }
            }
        }

        return if(firstId > secondId) intArrayOf(firstId, secondId)
        else intArrayOf(firstId, secondId)
    }
}
//2,7,11,15
class BestTwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val diffMap = mutableMapOf<Int, Int>()

        nums.forEachIndexed { index, int ->
            diffMap[int]?.let { return intArrayOf(it, index) }
            diffMap[target - int] = index
        }
        return intArrayOf()
    }
}
