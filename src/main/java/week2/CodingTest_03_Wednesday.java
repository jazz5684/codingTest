package week2;

import java.util.Scanner;

public class CodingTest_03_Wednesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a == 0 && b == 0) {
                sc.close();
                break;
            }
            System.out.println(a+b);
        }

    }
}
