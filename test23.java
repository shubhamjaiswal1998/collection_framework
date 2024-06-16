import java.io.*;
public class test23 {
    public static void create_file1() {
        try (FileOutputStream ob = new FileOutputStream("goel.txt");
            FileInputStream ob1 = new FileInputStream("goe.txt")) {
            String str = "hello world";
            byte ch1[] = str.getBytes();
            ob.write(ch1);
            int data;
            while (true) {
                data = ob1.read();
                if (data == -1) {
                    break;
                }
                System.out.print((char) data + " ");
            }
        } catch (IOException e) {
                e.printStackTrace(); }}
    public static void main(String[] args) {
        create_file1(); }
}
