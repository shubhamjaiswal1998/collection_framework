class genirics1<type1, type2> {
    type1 data1;
    type2 data2;
   // constructer
    public genirics1(type1 data1, type2 data2) {
        this.data1 = data1;
        this.data2 = data2;
    }
    //normal function
    public  void f1() { 
    System.out.println("this is f1 method called ");
    System.out.println("current type is of data1 "+this.data1.getClass().getName());
    System.out.println("current type is of data2 "+this.data2.getClass().getName());
    }
    //generic function 
    public <type3> void f2(type3 s) {
    System.out.println("this is f2 fn called");
    System.out.println("current type of f2 fn passed arug "+s.getClass().getName());
    }
  //generic function with bounded datatype
    public <type4 extends Number> void f3(type4 s1) {
    System.out.println("this is f3 fn called");
    System.out.println("current type of f2 fn passed arug "+s1.getClass().getName());        
    }


    // getters and setters for all type1 and type2
    public type1 getData1() {
        return data1;
    }

    public void setData1(type1 data1) {
        this.data1 = data1;
    }

    public type2 getData() {
        return data2;
    }

    public void setData(type2 data) {
        this.data2 = data;
    }
}

public class genirics {
    public static void main(String[] args) {
    genirics1<String, Integer> ob = new genirics1<>("ajay", 2);
    ob.f1();
    ob.f2(56);
    ob.f2("abcd");
    ob.f3(456);
    //ob.f3("abcb"); will give error bcoz bounded with Integer

    }
}
