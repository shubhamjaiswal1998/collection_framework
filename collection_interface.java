import java.util.ArrayList;
import java.util.Collection;//interface
import java.util.Collections;//class
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class collection_interface {
    static void auto_box(){
        Integer o1=new Integer(45);
        Integer o2=Integer.valueOf(45);
        Integer o3=45;//autoboxing
        int o4=o3;//unboxings
    }
    static void vectors() {// threadsafe so it is slow
        Vector<Integer> o1 = new Vector<>();
        o1.add(45);
        o1.add(47);
        o1.add(78);
        System.out.println(o1);
        System.out.println(o1.capacity());// 10
        // after exceed it will be 20 increse by 100%

    }

    static void f1() {
        Collection o1 = new ArrayList<>();
        o1.add(45);
        o1.add("abc");
        o1.add(78);
        o1.add("cat");
        o1.forEach(n -> System.out.print(n + " "));// 45 abc 78 cat

        // print data
        Iterator o2 = o1.iterator();
        while (o2.hasNext()) {
            System.out.print(o2.next() + " ");// 45 abc 78 cat
        }
        // print data
        System.out.println("by for loop without condition ");
        for (Object i : o1) {
            System.out.print(i + " ");//// 45 abc 78 cat
        }

        // ArrayList increase size with 50% but vecter by 100%
        // when exceed size pre size
        //// not threadsafe(synchronized) so it is fast
        List<Integer> o3 = new ArrayList<>();
        o3.add(4);
        o3.add(7);
        o3.add(11);
        o3.add(78);
        o3.add(1, 99);// will add 99 at index 1
        Collections.sort(o3);
        System.out.println(o3);// [4, 7, 11, 78, 99]

        // print it
        o3.forEach(System.out::println);

    }

    public static void main(String[] args) {
        // f1();
        vectors();
    }
}
