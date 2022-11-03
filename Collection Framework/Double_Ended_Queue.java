import java.util.ArrayDeque;

public class Double_Ended_Queue {
    public static void main(String[] args) {

        // . We can use functions of queue

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(100);
        adq.offer(200);
        adq.offer(300);
        adq.offer(400);
        adq.offerFirst(900);
        adq.offerLast(5000);

        System.out.println(adq);

        System.out.println(adq.peek());    //.          Top pointer
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        adq.pop(); // . POP or PEEk --> Delete
        adq.pollLast();
        adq.pollFirst();
        System.out.println(adq);

    }

}
