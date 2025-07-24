/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */

// @lc code=start

//  Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;

        // Step 1: Find the middle of the linked list
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Step 2: Reverse the second half
        ListNode secondHalf = reverse(slow.next);

        // Step 3: Compare first half with reversed second half
        ListNode firstHalf = head;
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        // If we reach here, all values matched, so it's a palindrome
        return true;
    }

    private ListNode reverse(ListNode node) {
        ListNode prev = null;
        ListNode current = node;
        ListNode forward = null; // Simplified: no need to initialize with current

        while (current != null) {
            forward = current.next;
            current.next = prev;
            prev = current;
            current = forward;
        }

        return prev;
    }
}
// @lc code=end
