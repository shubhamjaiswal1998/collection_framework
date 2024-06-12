import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class switch1 {
    static void take_input1(){
        Scanner sc=new Scanner(System.in);
        var input=sc.nextInt();
        System.out.println(input*2);
    }
    static void take_input() {

        InputStreamReader o1 = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(o1);
        System.out.println("enter a number ");
        try {
            var s = br.readLine();
            System.out.println(s);
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    ///////////////////////////
    static void switch1() {
        String s = "ccc";
        String s1 = " ";
        s1 = switch (s) {
            case "abc", "ccc":
                yield "6AM";
            case "bbc":
                yield "7AM";
            default:
                yield "default ";
        };
        System.out.println(s1);
    }

    public static void main(String[] args) {
        // switch1();
        take_input();
    }
}
