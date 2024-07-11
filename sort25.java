import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class c4 implements Comparator<student>{
 @Override
  public int compare(student o1, student o2) {
    
    return o1.name.compareTo(o2.name);
  }
}
class student implements Comparable<student>{
  int age;
  String name;
public student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return "student [age=" + age + ", name=" + name + "]";
  }

  @Override
  public int compareTo(student o) {
      if (this.age>o.age) {
         return 1;
      } else {
         return -1;
      }
  }

}



public class sort25 {
  public static void main(String[] args) {
    List<student> s1 = new ArrayList<>();
    s1.add(new student(25, "cat"));
    s1.add(new student(2, "bat"));
    s1.add(new student(39, "aat"));
    Collections.sort(s1,new c4());
    for (var i : s1) {
      System.out.println(i);
    }
    //student [age=39, name=aat] sort according to name
//student [age=2, name=bat]    //with comparater
//student [age=25, name=cat]

    Collections.sort(s1);
    for (var i : s1) {
      System.out.println(i);
    }
   //student [age=2, name=bat]
    //student [age=25, name=cat]sort according to age with Comparable
    //student [age=39, name=aat]
  }
}
