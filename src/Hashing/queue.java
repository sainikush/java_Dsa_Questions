package Hashing;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("Amaan");
        queue.offer("Rahul");
        queue.offer("Priya");
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        Queue<Integer> prior = new PriorityQueue<>();
        prior.offer(45);
        prior.offer(13);
        prior.offer(66);
        prior.offer(12);
        System.out.println(prior);

        System.out.println(prior.poll());
        System.out.println(prior.poll());
        System.out.println(prior.poll());

//      Array Deque
        // Array Deque is a reziable array implementatiin off the deque interface.
        // it can be used as :
        // a normal fifo queue
        // a lifo stack
        // a double ended queue

        Queue<Integer> arrdequ = new ArrayDeque<>();

        arrdequ.offer(19);
        arrdequ.offer(45);
        arrdequ.offer(68);
        System.out.println(arrdequ.poll());
        System.out.println(arrdequ.poll());
    }
}
