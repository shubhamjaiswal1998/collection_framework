import java.util.Scanner;
class Innercalculter {
    //
    public static void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number ");
        int b = sc.nextInt();
        int result = a + b;
        System.out.println("result is " + result);
    }

    //
    public static void subtraction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number ");
        int b = sc.nextInt();
        int result = a - b;
        System.out.println("result is " + result);
    }

    //
    public static void multiplacation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number ");
        int b = sc.nextInt();
        int result = a * b;
        System.out.println("result is " + result);
    }

    //
    public static void division() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number ");
        int a = sc.nextInt();
        System.out.println("enter 2nd number ");
        int b = sc.nextInt();
        if (b == 0) {
            throw new ArithmeticException("division by zero");
        }
        float result = a / b;
        System.out.println("result is " + result);
    }
}

class xyz1234 {
    public static void take_user_input() {
        System.out.println("enter your choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Innercalculter.add();
                break;
            case 2:
                Innercalculter.subtraction();
                break;
            case 3:
                Innercalculter.multiplacation();
                break;
            case 4:
                Innercalculter.division();
                break;
            default:System.out.println("enter right choice");
                break;
        }

    }

}

public class calculter {
    public static void main(String[] args) {
  xyz1234.take_user_input();
    }
}
