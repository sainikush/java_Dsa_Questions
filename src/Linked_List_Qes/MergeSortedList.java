package Linked_List_Qes;

public class MergeSortedList {
    private Node head;
    private Node tail;
    private int size;

    public MergeSortedList() {
        this.size = 0;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static MergeSortedList merge(MergeSortedList first, MergeSortedList second) {
        Node f = first.head;
        Node s = second.head;

        MergeSortedList ans = new MergeSortedList();

        // 1. Compare elements from both lists and insert the smaller one
        while (f != null && s != null) {
            if (f.value < s.value) {
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }

        // 2. Append remaining elements from the first list, if any
        while (f != null) {
            ans.insertLast(f.value);
            f = f.next;
        }

        // 3. Append remaining elements from the second list, if any
        while (s != null) {
            ans.insertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        MergeSortedList first = new MergeSortedList();
        MergeSortedList second = new MergeSortedList();

        // Populating first sorted list: 1 -> 3 -> 5 -> END
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);

        // Populating second sorted list: 1 -> 2 -> 9 -> 14 -> END
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);

        System.out.print("First List:  ");
        first.display();

        System.out.print("Second List: ");
        second.display();

        MergeSortedList mergedList = MergeSortedList.merge(first, second);

        System.out.print("Merged List: ");
        mergedList.display();
    }
}