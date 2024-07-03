import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class student {
  String name;
  int age;
public student(String name, int age) {
    this.name = name;
    this.age = age;
  }
public String getName() {
  return name;
}
public int getAge() {
  return age;
}

@Override
  public String toString() {
    return " " + name + " " + age + " ";
  }
}
public class comparable12 {
  public static void main(String[] args) {
    List<student> l1 = new ArrayList<>();
    student s1 = new student("shubham", 45);
    student s2 = new student("aman", 5);
    student s3 = new student("vijay", 35);
    l1.add(s1);
    l1.add(s2);
    l1.add(s3);
    System.out.println(l1);// [ shubham 45 , aman 5 , vijay 35 ]
    //sorting with age
    Collections.sort(l1,Comparator.comparing(student::getAge));
    System.out.println(l1);// [ aman 5 ,  vijay 35 ,  shubham 45 ]

    //sorting with name
    Collections.sort(l1,Comparator.comparing(student::getName));
    System.out.println(l1);//[ aman 5 ,  shubham 45 ,  vijay 35 ]
  }
}
