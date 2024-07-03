import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class map1 {
  public static void treemap() {
    Map<Integer,String> m1=new TreeMap<>();
    m1.put(45, "aman"); m1.put(13, "ajay");
    m1.put(36, "kumar"); m1.put(89, "rakesh");
    System.out.println(m1);//{13=aman, 36=aman, 45=aman, 89=aman}
    System.out.println(m1.putIfAbsent(37, "vijay"));//null
    System.out.println(m1.putIfAbsent(36, "kumar1"));//kumar
    System.out.println(m1);//{13=ajay, 36=kumar, 37=vijay, 45=aman, 89=rakesh}

    //but if only use put() and key is duplicate then override the keys
    m1.put(36, "kumar2");
    System.out.println(m1);//{13=ajay, 36=kumar2, 37=vijay, 45=aman, 89=rakesh}
    
    //add some data together
    Map<Integer,String> m2=new TreeMap<>();
    m2.put(51, "ankit2");m2.put(52, "ankit3");
    m1.putAll(m2);
    System.out.println(m1);//{13=ajay, 36=kumar2, 37=vijay, 45=aman, 51=ankit2, 52=ankit3, 89=rakesh}
    
    for (Map.Entry<Integer,String> i : m1.entrySet()) {
      System.out.print(" "+i.getKey()+" -> "+i.getValue());
    }
   }
  public static void LinkedHashMap1() {
    Map<Integer,String> m1=new LinkedHashMap<>();
    m1.put(1, "aman");//keys will not duplicate in map
    m1.put(1, "anuj");//it will give updated keys's value
    m1.put(2, "aman");
    m1.put(3, "ankit");
    m1.put(4, "ajay");
    m1.put(5, "ajay");//but values can be duplicate
    System.out.println(m1);//{1=anuj, 2=aman, 3=ankit, 4=ajay, 5=ajay}

    //print all data with keys and values
    for (Map.Entry<Integer,String> i : m1.entrySet()) {
      System.out.print(i.getKey()+" : "+i.getValue());
    }
    //1 : anuj2 : aman3 : ankit4 : ajay5 : ajay

    //print only keys with loop without condition
    for (Integer i : m1.keySet()) {
      System.out.print(i+" ");//1 2 3 4 5
    }
    //with  normal for loop
    Set<Integer> s1=m1.keySet();
    List<Integer> l1=new ArrayList<>(s1);
    for (int i = 0; i < l1.size(); i++) {
       System.out.print(l1.get(i)+" ");
    }

    //for only values 
    for (String i : m1.values()) {
      System.out.print(i+" ");//anuj aman ankit ajay ajay 
    }

    //while  loop with Iterator
    //Collection don't have get() method then use Iterator
    Collection<String> c1=m1.values();
    Iterator itr=c1.iterator();
    while (itr.hasNext()) {
      System.out.print(itr.next()+" ");
    }
    
    Collection  c2=m1.values();
    List<String> l2=new ArrayList<>(c2);
    for (int i = 0; i < l2.size(); i++) {
      System.out.print(l2.get(i)+" ");//anuj aman ankit ajay ajay
    }
    
    
  }
  public static void hashmap1() {
    Map<Integer, String> m1 = new HashMap<>();
    m1.put(1, "aman");//keys will not duplicate in map
    m1.put(1, "anuj");//it will give updated keys's value
    m1.put(2, "aman");
    m1.put(3, "ankit");
    m1.put(4, "ajay");
    m1.put(5, "ajay");//but values can be duplicate
    System.out.println(m1);//{1=anuj, 2=aman, 3=ankit, 4=ajay, 5=ajay}

    //some opration
    System.out.println(m1.keySet());//[1, 2, 3, 4, 5]
    System.out.println(m1.entrySet());//[1=anuj, 2=aman, 3=ankit, 4=ajay, 5=ajay]
    System.out.println(m1.values());//[anuj, aman, ankit, ajay, ajay]
    System.out.println(m1.keySet().getClass().getName());//java.util.HashMap$KeySet

    //data store In
    Set s1=m1.keySet();//keys store in set & KeySet() Function give all element
    System.out.println(s1);//[1, 2, 3, 4, 5]

    Collection<String> c1= m1.values();//vlaues can store in Collection only not List
    System.out.println(c1);//[anuj, aman, ankit, ajay, ajay]

    System.out.println(m1.size());//5
    System.out.println(m1.equals(4));//false but no make sense here
    System.out.println(m1.containsKey(4));//true
    System.out.println(m1.containsValue("ajay"));//true
    System.out.println(m1.isEmpty());//false
    System.out.println(m1.get(4));//ajay
    System.out.println(m1.remove(3));//ankit will return deleted value
    System.out.println(m1);//{1=anuj, 2=aman, 4=ajay, 5=ajay}
    System.out.println(m1.put(6,"gaurav"));//
    System.out.println(m1);//{1=anuj, 2=aman, 4=ajay, 5=ajay, 6=gaurav}

    
    //traverse
    for (Map.Entry<Integer, String> i:m1.entrySet()) {
      System.out.println(i.getKey()+" "+i.getValue());
    }
  }

  public static void main(String[] args) {
    //hashmap1();
    //LinkedHashMap1();
    treemap();
  }

}