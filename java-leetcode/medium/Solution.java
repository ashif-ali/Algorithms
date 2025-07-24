
import java.util.HashSet;

/*
 * @lc app=leetcode id=142 lang=java
 *
 * [142] Linked List Cycle II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 */

// class ListNode {
// int val;
// ListNode next;

// ListNode(int x) {
// val = x;
// next = null;
// }
// }

public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode fast = head, slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                fast = head;
                while (fast != slow) {
                    fast = fast.next;
                    slow = slow.next;
                }
                return slow; // we can either return slow or fast, they point to the same node
            }
        }
        return null;
    }
}

// @lc code=end

// public class Solution {
// public ListNode detectCycle(ListNode head) {
// if (head == null || head.next == null)
// return null;

// HashSet<ListNode> visited = new HashSet<>();
// ListNode current = head;

// while (current != null) {
// if (visited.contains(current)) {
// return current;
// }
// visited.add(current);
// current = current.next;
// }
// return null;
// }
// }
