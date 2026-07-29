package Linked_List_Qes;

public class RemoveDuplicates {

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void duplicate(){
        Node node = head;
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }  else {
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }

}


// leet code : 83: Remode duplicates from sorted list
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//
//        if(head == null){
//            return head;
//        }
//        ListNode node = head;
//        while (head.next != null){
//            if(head.val == head.next.val){
//                head.next = head.next.next;
//            }else{
//                head = head.next;
//            }
//        }
//        return node;
//
//    }
//}