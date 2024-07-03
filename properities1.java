import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
public class properities1 {
  public static void f1() {
    Properties p1 = new Properties();
    // Set properties
    p1.setProperty("username", "shubham");
    p1.setProperty("pass", "123");
    p1.setProperty("url", "http://shubham12.com");
    // Save properties to a file
    try {
      FileOutputStream file1 = new FileOutputStream("str123.txt");
      p1.store(file1, "this is comment 1");
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println("code run sucessfully");

    // Get all Data from str123.txt file
    Properties p2 = new Properties();
   try {
      FileInputStream file2 = new FileInputStream("str123.txt");
      p2.load(file2);

    } catch (IOException e) {

      e.printStackTrace();
    }

    System.out.println(p2.getProperty("username"));//shubham
    System.out.println(p2.getProperty("pass"));//123
    System.out.println(p2.getProperty("url"));//http://shubham12.com
  }

  public static void main(String[] args) {
    f1();
  }
}
