package com.jaehyeon.algorithms


/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class AddTwoNumbers {

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val head = ListNode(99)
        var cur = head
        var n1 = l1
        var n2 = l2
        var carry = 0

        while (n1 != null || n2 != null) {
            val sum = (n1?.`val` ?: 0) + (n2?.`val` ?: 0) + carry
            cur.next = ListNode(sum % 10)
            cur.next?.let {
                cur = it
            }

            carry = sum / 10

            if (n1 != null) n1 = n1.next
            if (n2 != null) n2 = n2.next
        }

        if (carry > 0) {
            cur.next = ListNode(carry)
            cur.next?.let {
                cur = it
            }
        }

        return head.next
    }
}