import java.util.Scanner;

@FunctionalInterface
interface add1 {
  abstract public int add(int a, int b);
}

@FunctionalInterface
interface sub1 {
  abstract public int sub(int a, int b);
}

public class calculater2 {
  public static void main(String[] args) {
    add1 d1 = (a, b) -> {
      return a + b;
    };
    sub1 d2 = (a, b) -> {
      return a - b;
    };
    System.out.println("welcome ");
    while (true) {
      String pass = "###";
      Scanner sc3 = new Scanner(System.in);
      System.out.println("enter password");
      String pass1 = sc3.nextLine();
      System.out.println("enter your name ");
      String admin_name=sc3.nextLine();
      if ("###".equals(pass1) && "admin".equals(admin_name)) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter user opration");
        String op = sc.nextLine();
        System.out.println("enter num1");
        int num1 = sc.nextInt();
        System.out.println("enter num2");
        int num2 = sc.nextInt();

        switch (op) {
          case "+", "1" -> System.out.println("sum is " + d1.add(num1, num2));

          case "-", "2" -> System.out.println("subtraction is " + d2.sub(num1, num2));

          default -> System.out.println("enter write choice");
        }
        System.out.println("enter a exit for shutdown");
        Scanner sc1 = new Scanner(System.in);
        String str2 = sc1.nextLine();
        if ("exit".equals(str2)) {
          break;
        }

      } else {
        System.out.println("please enter correct password ");
        break;
      }
    }
    System.out.println("done");
  }
}
