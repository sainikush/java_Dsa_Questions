package Linked_List_Qes;

public class DetectCycle {

    public int LengthOFCycle( listNode head){

        listNode fast = head;
        listNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                listNode temp = slow;
                int length = 0;
                 do {
                     temp = temp.next;
                     length++;
                 } while (temp != slow);
                 return length;
            }
        }
        return 0;
    }



    public listNode detectCycle(listNode head){
        int length = 0;

        listNode fast = head;
        listNode slow = head;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow){
                length =  LengthOFCycle(slow);
                break;
            }
        }

        // if no cycle present return 0
        if (length == 0) {
            return null;
        }

        // find the start node
        listNode f = head;
        listNode s = head;

        while (length > 0 ){
            s = s.next;
            length--;
        }

        // keep moving both s and f so they will meet a one point
        while (f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }


    private class listNode{
       private listNode next;
        public int value;

        public listNode(int value){
            this.value = value;
        }
        public listNode(int value, listNode next){
            this.value = value;
            this.next = next;
        }
    }
}
