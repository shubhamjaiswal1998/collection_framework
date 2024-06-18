import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class collections123 {

    public static void list() {
        List<Integer> list1 = new ArrayList<>();
        list1.add(16);
        list1.add(26);
        list1.add(6);
        list1.add(26);
        list1.add(76);
        list1.add(96);
        list1.add(0, 99);
        System.out.println(list1);// [99, 16, 26, 6, 26, 76, 96]

        list1.addAll(list1);// it will add all element again together
        System.out.println(list1);// [99, 16, 26, 6, 26, 76, 96, 99, 16, 26, 6, 26, 76, 96]

        // add some element from specified index
        List<Integer> list2 = Arrays.asList(4, 4, 3);
        list1.addAll(11, list2);
        System.out.println(list1);// [99, 16, 26, 6, 26, 76, 96, 99, 16, 26, 6, 4, 4, 3, 26, 76, 96]

        // remove 3 element from starting index
        list1.remove(0);
        list1.remove(0);
        list1.remove(0);
        System.out.println(list1);// [6, 26, 76, 96, 99, 16, 26, 6, 4, 4, 3, 26, 76, 96]

        // remove all element which was present in list2 [4,3] 4,3 will delete does not
        // matter
        // where is present these element
        list1.removeAll(list2);
        System.out.println(list1);// [6, 26, 76, 96, 99, 16, 26, 6, 26, 76, 96]

        list1.addFirst(11);
        list1.addLast(11);
        System.out.println(list1);// [11, 6, 26, 76, 96, 99, 16, 26, 6, 26, 76, 96, 11]

        System.out.println(list1.indexOf(11));// 0 ,see from left
        System.out.println(list1.lastIndexOf(11));// 12 ,see from right

        System.out.println("first element " + list1.getFirst() + " and last " + list1.getLast());
        // first element 11 and last 11

        // remove according to condition
        list1.removeIf((n) -> n % 3 == 0);
        list1.removeIf((n) -> n < 26);
        System.out.println(list1);// [26, 76, 26, 26, 76]

        // reverse it
        System.out.println(list1.reversed());// [76, 26, 26, 76, 26]

        System.out.println(list1.iterator());// java.util.ArrayList$Itr@65ab7765

        // print it
        Iterator<Integer> itr = list1.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");// 26 76 26 26 76
        }

        System.out.println();
        System.out.println("printing by forEach");
        list1.forEach(n -> System.out.print(n + " "));// 26 76 26 26 76

        // first delete element at index then place that position
        list1.set(0, 99);
        System.out.println(list1);// [99, 76, 26, 26, 76]

        // sort the element
        Collections.sort(list1);
        System.out.println(list1);// [26, 26, 76, 76, 99]

        // again sort in reverse order
        Collections.sort(list1, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list1);// [99, 76, 76, 26, 26]

        list1.clear();
        System.out.println(list1);//[]

        
    }

    //////////////////////////////////////////////////////////////////////
    public static void colection() {
        Collection ob1 = new ArrayList<>();
        ob1.add(45);
        ob1.add(46);
        ob1.add(47);
        ob1.add("bbc");
        ob1.add("abc");
        ob1.add(16);
        System.out.println(ob1);// [45, 46, 47, bbc, abc, 16]
        ob1.remove(15);
        ob1.remove("bbc");// delete direct object
        System.out.println(ob1);// [45, 46, 47, abc, 16]

        // use genrics and bound it
        Collection<Integer> ob2 = new ArrayList<>();
        ob2.add(45);
        ob2.add(46);
        ob2.add(47);
        // ob2.add("bbc"); ob2.add("abc"); this line give error bcoz bounded by Integer
        List<Integer> ob3 = Arrays.asList(1, 5, 2, 3, 4, 5);
        ob2.addAll(ob3);

        // after adding all element of ob3
        System.out.println(ob2);// [45, 46, 47, 1, 5, 2, 3, 4, 5]
        System.out.println(ob2.contains(5));// true
        System.out.println(ob2.equals(ob3));// false, compare all specified object
        System.out.println(ob2.isEmpty());// false

        List<Integer> ob4 = Arrays.asList(1, 5, 2, 4, 5);
        System.out.println(ob2.removeAll(ob4));
        System.out.println(ob2);// [45, 46, 47, 3]
        // System.out.println(ob2.indexof(5)); not available on Collection
        System.out.println(ob4.indexOf(5) + " and  " + ob4.indexOf(4));// 1 and 3

    }

    public static void main(String[] args) {
        // colection();
        list();
    }
}
