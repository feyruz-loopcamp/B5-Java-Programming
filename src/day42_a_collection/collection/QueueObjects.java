package day42_a_collection.collection;

import java.util.PriorityQueue;

public class QueueObjects {
    public static void main(String[] args) {


        /*
            QUEUE interface
                PriorityQueues
                    - Random Order
                    - allows duplicate
                    - does not allow null
                    - FIFO: First In (stored order) First Out (after each poll(), new stored elements will be randomized again )


                    .add(elem); ----- > offer();
                    .remove(elem) --- > poll();
                    .get() ---------- > peak();
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(2);
        priorityQueue.add(10);
        priorityQueue.add(8);
        priorityQueue.add(1);
        priorityQueue.add(2);
        // priorityQueue.add(null);

        System.out.println(priorityQueue);

        priorityQueue.offer(30);
        System.out.println(priorityQueue);
        priorityQueue.offer(1);
        System.out.println(priorityQueue);

        System.out.println();
        priorityQueue.poll(); // FIFO: First in First Out --- > [1, 2, 1, 10, 2, 30, 8]
        System.out.println(priorityQueue); // [1, 2, 8, 10, 2, 30]
        priorityQueue.poll(); // FIFO: First in First Out
        System.out.println(priorityQueue); // [2, 2, 8, 10, 30]
        priorityQueue.poll(); // FIFO: First in First Out
        System.out.println(priorityQueue); // [2, 10, 8, 30]
        priorityQueue.poll(); // FIFO: First in First Out
        System.out.println(priorityQueue);
        priorityQueue.poll(); // FIFO: First in First Out
        System.out.println(priorityQueue);


    }
}
