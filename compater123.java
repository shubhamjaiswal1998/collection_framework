import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class student1 {
  int age;
  String name;

  public student1(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "name= " + name + " and age= " + age + " ";
  }

  public String getName() {
    return name;
  }

}

public class compater123 {
  public static void main(String[] args) {
    List<student1> l1 = new ArrayList<>();
    l1.add(new student1(45, "cat"));
    l1.add(new student1(15, "dat"));
    l1.add(new student1(85, "aat"));
    l1.add(new student1(65, "oat"));
    for (int i = 0; i < l1.size(); i++) {
      System.out.println(l1.get(i));
    }
  //with lambada expression
    Collections.sort(l1, (o1, o2) -> o1.name.compareTo(o2.name));
    System.out.println("after sorting with name ");
    for (int i = 0; i < l1.size(); i++) {
      System.out.println(l1.get(i));
    }
  //without lambada expression
    Collections.sort(l1, new Comparator<student1>() {
      @Override
      public int compare(student1 i, student1 j) {
        return Integer.compare(i.age, j.age);
      }
    });
    System.out.println("after sorting with age ");
    for (int i = 0; i < l1.size(); i++) {
      System.out.println(l1.get(i));
    }

    System.out.println("again after sorting with name using method reference");
    Collections.sort(l1, Comparator.comparing(student1::getName));
    for (int i = 0; i < l1.size(); i++) {
      System.out.println(l1.get(i));
    }
    /*
     * output
     * name= cat and age= 45
     * name= dat and age= 15
     * name= aat and age= 85
     * name= oat and age= 65
     * after sorting with name
     * name= aat and age= 85
     * name= cat and age= 45
     * name= dat and age= 15
     * name= oat and age= 65
     * after sorting with age
     * name= dat and age= 15
     * name= cat and age= 45
     * name= oat and age= 65
     * name= aat and age= 85
     * again after sorting with name using method reference
     * name= aat and age= 85
     * name= cat and age= 45
     * name= dat and age= 15
     * name= oat and age= 65
     * 
     */

     List<Integer> l2=new  ArrayList<>();
     l2.add(45);l2.add(5);l2.add(35);
     l2.add(50); l2.add(1); l2.add(15);
     Collections.sort(l2,Collections.reverseOrder());
     System.out.println(l2);//[50, 45, 35, 15, 5, 1]
     //again reverse it with new list
     List<Integer> l3=new ArrayList<>();
     for (int i = l2.size()-1; i>=0; i--) {
       l3.add(l2.get(i));
     }
     System.out.println(l3);//[1, 5, 15, 35, 45, 50]
  }
}
