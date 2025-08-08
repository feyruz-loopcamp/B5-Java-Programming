package day41_collection.list;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

     /*
        Stack
            - Child class of Vector
            - it is synchronized / thread safe
            - Last In - First Out (LIFO)
            - insertion order is kept
     */
        // add(elem) ---- > push(elem);
        // remove(elem) - > pop(); --- > removes the element which is at the top
        // get(index) --- > peak(); -- > gets the element which is at the top

        Stack <Character> stack1 = new Stack<>();



        stack1.push('a');
        stack1.push('b');
        stack1.push('c');
        stack1.push('d');
        System.out.println(stack1);

        System.out.println(stack1.peek());
        stack1.pop();
        System.out.println(stack1.peek());


        // Q: How about if I want to remove the one at the bottom
        // A: Again you can still use remove() method
        stack1.remove(0);
        System.out.println(stack1);

    }
}
