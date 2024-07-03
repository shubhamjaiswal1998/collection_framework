import java.util.*;
public class set3 {
  public static void remove_duplicate(String s) {
    Set<Character> s1=new  LinkedHashSet<>();
    char[] arr=s.toCharArray();
    for (Character i : arr) {
        s1.add(i);
    }
    System.out.println(s1);//[a, b, c, d, e]
    StringBuilder s2=new StringBuilder();
    for (char i : s1) {
      s2.append(i);
    }
    System.out.println(s2);//abcde
  }
  public static void main(String[] args) {
   
     remove_duplicate("abbcde");//
  }
}
