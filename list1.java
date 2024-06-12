import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class genrics_list1<T extends Float> {//bounded with float value
    T data;
    public  void print_data(){
     System.out.println(data.getClass().getName());
    }
    //getters & setters 
 public T getData() {
     return data;
 }

 public void setData(T d) {
     this.data = d;
 }
 public  void take_array_list(ArrayList<? extends T> ob) {
    System.out.println(ob.getClass().getName());
 }   
    
}
class genrics_list<T>{
   
       T data;
       public  void print_data(){
        System.out.println(data.getClass().getName());
       }
       //getters & setters 
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
       

}
public class list1 {
   static void f1(){
    Collection o1=new ArrayList<>();
     o1.add("123");
     o1.add("abc");
     o1.add(456);
     System.out.println(o1);//[123, abc, 456]
     

     List o2=new ArrayList<>();
     o2.add("123");
     o2.add("abc");
     o2.add(456);
     System.out.println(o2);////[123, abc, 456]
     
    // System.out.println(Integer.parseInt(o2.get(0)).toString());
    

    }
public static void main(String[] args) {
    f1();
    genrics_list<Integer> o1=new genrics_list<>();
    o1.data=45;
    o1.print_data();//java.lang.Integer
    genrics_list<Double> o2=new genrics_list<>();
    o2.data=45.0;
    o2.print_data();//java.lang.Double
    //use getters & setters
    
    genrics_list<Object> o3=new genrics_list<>();
    o3.setData(45);
    o3.print_data();

    genrics_list1<Float> o4=new genrics_list1<>();
    o4.setData((float) 5.0);//bounded with float value
    o4.print_data();
    
   // o4.take_array_list(new ArrayList<Number>());
    
    
}
    
}