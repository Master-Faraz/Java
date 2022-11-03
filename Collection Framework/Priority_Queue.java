import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue {
    public static void main(String[] args) {

        // . Priority queue implments MIN HEAP by default
        // . Same functions as Queue

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq); // . Here our order is Rearranged according to min Heap

        pq.poll();
        System.out.println(pq);

        // .******************************** Max Heap ***************************

        System.out.println("\n\nMax Heap \n\n");

        PriorityQueue<Integer> pq_max_heap = new PriorityQueue<>(Comparator.reverseOrder());

        pq_max_heap.offer(40);
        pq_max_heap.offer(12);
        pq_max_heap.offer(24);  
        pq_max_heap.offer(36);

        System.out.println(pq_max_heap); // . Here our order is Rearranged according to min Heap

        pq_max_heap.poll();
        System.out.println(pq_max_heap);

    }
}
