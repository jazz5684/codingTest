package week2;

import java.util.Scanner;

public class CodingTest_02_Tuesday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        a = scan.nextInt();
        for (int i = 0; i<a; i++) {
            b = scan.nextInt();
            c = scan.nextInt();
            System.out.println("Case #" + (i+1) + ": " + (b + c));
        }
    }
}
