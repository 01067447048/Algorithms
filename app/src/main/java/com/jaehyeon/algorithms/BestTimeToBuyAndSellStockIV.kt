package com.jaehyeon.algorithms

import kotlin.math.*

class BestTimeToBuyAndSellStockIV {
    fun maxProfit(k: Int, prices: IntArray): Int {
        if(k == 0){
            return 0
        }

        val cost = IntArray(k){Int.MAX_VALUE}
        val profit = IntArray(k){0}

        prices.forEach{
            for (i in 0 until k){
                cost[i] = min(cost[i], it - (profit.getOrNull(i-1)?: 0))
                profit[i] = max(profit[i], it-cost[i])
            }

        }
        return profit[k-1]
    }
}