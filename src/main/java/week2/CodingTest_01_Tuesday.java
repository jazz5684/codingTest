package week2;
import java.util.Scanner;

public class CodingTest_01_Tuesday {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a, b;
        double result;
        a = scan.nextInt();
        b = scan.nextInt();
        result = (double) a / b;
        System.out.println(a + " / " + b + " = " + result);

    }
}
