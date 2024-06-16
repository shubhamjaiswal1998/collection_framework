import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class sum_all_ele {
    static void f1() {
        List<Integer> ob1 = Arrays.asList(1, 2, -3, 4, 8, 53, 41, 45, -6, 36, 41);
        int c = 0;
        int s = 0;
        for (Integer i : ob1) {
            c = c + 1;
            if (i > 0 && i % 2 == 0) {
                s = s + i;
            }
        }
        System.out.println("count is " + c + " even_sum is  " + s + " ");

    }

    static void f2() {
        List<Integer> ob1 = Arrays.asList(1, 2, -3, 4, 8, 53, 41, 45, -6, 36, 41);
        Stream<Integer> ob = ob1.stream();

        Integer s = ob.filter((n) -> n % 2 == 0).filter((n) -> n > 0).reduce(0, (c, e) -> c + e);
        
        System.out.println( + s);

        List<Integer> ob2 = Arrays.asList(1, 2, -3, 4, 8, 53, 41, 45, -6, 36, 41);
    Stream<Integer> o3=ob2.stream();
        long c = o3.count();
        System.out.println(c);
    }
public static void f3() {
    
    List<Integer> ob2 = Arrays.asList(1, 2, -3, 4, 8, 53, 41, 45, -6, 36, 41);
    Stream<Integer> o3=ob2.stream();
        long c = o3.count();
        System.out.println(c);
}
    public static void main(String[] args) {
        f1();
        f2();
       // f3();
    }
}
