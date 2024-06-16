import java.io.*;
public class test25 {
    public static void f1() {
try {
     FileOutputStream ob1 = new FileOutputStream("goel.txt");
            String str1 = "helo world";
            byte ch1[] = str1.getBytes();
            ob1.write(ch1);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
   public static void f2() {
    try{
     FileInputStream ob2=new FileInputStream("goel.txt");
      int data;
      while (true) {
             data=ob2.read();
             if (data==-1) {
                break;
             }
             System.out.print((char)data+" ");
      }
    }
    catch(IOException e){
         e.printStackTrace();
    }
   }
    public static void main(String[] args) {
        f1();
        f2();
    }
}
