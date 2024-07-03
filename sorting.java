import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class sorting {

  public static void sort_array() {
    //m-1 sort array
    String arr[]={"kamal","ajay","cat","vijay","sumit"};
    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));//[ajay, cat, kamal, sumit, vijay]

    //m-2 for sorting using Comparator
    String arr2[]={"kamal","ajay","cat","vijay","sumit"};
    Arrays.sort(arr2);
    Arrays.sort(arr2,new Comparator<String>() {
      @Override
      public int compare(String r1,String r2){
        return r2.compareTo(r1);
      }
    });
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i]+" ");//vijay sumit kamal cat ajay 
    }
  }
  /////////////////////////////////////////////////////////////
  public static void sort_list() {
    List<Integer> l1=new ArrayList<>();
    l1.add(45); l1.add(11); l1.add(48);
    l1.add(30); l1.add(29); l1.add(16);
    l1.add(46); l1.add(14); l1.add(4);

    System.out.println(l1);//[45, 11, 48, 30, 29, 16, 46, 14, 4]
    //m-1 for sorting
    Collections.sort(l1);
    System.out.println(l1);//[4, 11, 14, 16, 29, 30, 45, 46, 48]
 
    //m-2 for sorting using Compartor Class & 
    List<Integer> l2=new ArrayList<>();
    l2.add(45); l2.add(11); l2.add(48);
    l2.add(30); l2.add(29); l2.add(16);
    System.out.println(l2);//[45, 11, 48, 30, 29, 16]
    Collections.sort(l2,new Comparator<Integer>(){
    @Override
    public int compare(Integer ele1, Integer ele2){
       return  ele1.compareTo(ele2);//if replace ele1 to ele2 then 
       //it will be reversed in decending order
    }
    });
    System.out.println(l2);//[11, 16, 29, 30, 45, 48]

    
  }
  public static void main(String[] args) {
    //sort_list();
    sort_array();
  }
}
