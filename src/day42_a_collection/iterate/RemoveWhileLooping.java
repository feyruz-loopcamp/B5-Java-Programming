package day42_a_collection.iterate;

import java.util.*;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        List <Integer> list1 = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 54, 23, 65, 3, 6));
        System.out.println(list1);

        // 1 - Remove with tradition loop - >  it will cause skipping checking of some of the elements
        for (int i = 0; i < list1.size(); i++) {
            //System.out.println(list1.get(i));
            if (list1.get(i) < 6 ) {
                list1.remove(i);
            }
        }
        System.out.println(list1);
        /*
            elem:   2, 3, 5, 6, 12, 54, 23, 65, 3, 6    - size: 10
            index:  0  1  2  3   4   5   6   7  8  9
            i=0;
                elem:   3, 5, 6, 12, 54, 23, 65, 3, 6    - size: 9
                index:  0  1  2  3   4   5   6   7  8  9

            i=1;
                elem:   3, 5, 6, 12, 54, 23, 65, 3, 6    - size: 9 --- >  after removing all element SHIFTED to left, causing missing element
                index:  0  1  2  3   4   5   6   7  8  9
         */


        System.out.println("---------------------------------------------------------");
        // 2 - Remove with foreach loop - Since changes, foreach loop will throw exception: ConcurrentModificationException
        try{
            List <Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 54, 23, 65, 3, 6));
            for ( Integer each : list2) { // 10 -- 9 --- > Since changes, foreach loop will throw exception: ConcurrentModificationException
                if (each < 6) {
                    list2.remove(each);
                }
            }
            System.out.println(list2);
        } catch (RuntimeException e) {
            //System.out.println(e.getMessage());
            //e.printStackTrace();
            System.out.println("There was ConcurrentModificationException and it was caught");
        }


        System.out.println("---------------------------------------------------------");
        // 3 - removeIf
        List <Integer> list3 = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 54, 23, 65, 3, 6));
        System.out.println(list3);
        list3.removeIf(each -> each < 6);
        System.out.println(list3);

        /*
            default boolean removeIf(Predicate<? super E> filter) {
                Objects.requireNonNull(filter);
                boolean removed = false;
                final Iterator<E> each = iterator();
                while (each.hasNext()) {
                    if (filter.test(each.next())) {
                        each.remove();
                        removed = true;
                    }
                }
                return removed;
            }
         */


        System.out.println("---------------------------------------------------------");
        // 4 - iterator
        List <Integer> list4 = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 12, 54, 23, 65, 3, 6));
        System.out.println(list4);
        Iterator <Integer> it = list4.iterator(); // to be able to use .hasNext(), .next(), remove() method, we created this object
        while (it.hasNext()) {
            if (it.next() < 6 ) {
                it.remove();
            }
        }
        System.out.println(list4);


        /*
                                v
                                 2, 3, 5, 6, 12, 54, 23, 65, 3, 6
                                 3, 5, 6, 12, 54, 23, 65, 3, 6
                                 5, 6, 12, 54, 23, 65, 3, 6
                                 6, 12, 54, 23, 65, 3, 6
                              6, 12, 54, 23, 65, 3, 6
                          6, 12, 54, 23, 65, 3, 6
                      6, 12, 54, 23, 65, 3, 6
                  6, 12, 54, 23, 65, 3, 6
              6, 12, 54, 23, 65, 3, 6
              6, 12, 54, 23, 65, 6
           6, 12, 54, 23, 65, 6
         */



        System.out.println("END");

    }
}
