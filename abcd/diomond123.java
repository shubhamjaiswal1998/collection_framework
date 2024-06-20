class genrics1<type1,type2>{
    type1 data1;
    type2 data2;
     genrics1(type1 data1,type2 data2){
        this.data1=data1;
        this.data2=data2;
        System.out.println(data1.getClass());
        System.out.println(data2.getClass());

     }
}
public class diomond123 {
    public static void main(String[] args) {
genrics1<Integer,String> ob=new genrics1<>(2,"abcd");
    }
}
