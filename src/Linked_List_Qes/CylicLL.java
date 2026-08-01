package Linked_List_Qes;

import java.util.List;

public class CylicLL {
    private listNode head;
    private listNode tail;
    private int size;

    public boolean hasCycle(listNode head){
        listNode fast = head;
        listNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }

    public int lengthCycle(listNode head){
        listNode fast = head;
        listNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                listNode  temp = slow;
                int length = 0;
                do {
                    temp = temp.next;
                    length++;
                } while ( temp != slow);
                return length;
            }
        }
        return 0;
    }

    private class listNode{
        private int value;
        private listNode next;

        public listNode(int value){
            this.value = value;
        }
        public listNode(int value, listNode next){
            this.value =  value;
            this.next = next;
        }

    }

    public static void main(String[] args) {

    }
}
