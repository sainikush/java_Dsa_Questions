package Linked_List_Qes;

import java.util.List;

public class CyclicLL2 {
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next; // moves two steps
            slow = slow.next; // moves one step

            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    private class ListNode{
        private int value;
        private ListNode next;

        public ListNode(int value){
            this.value = value;
        }

        public ListNode (int value,ListNode next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
}
