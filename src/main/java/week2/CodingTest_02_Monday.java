package week2;

import java.util.Scanner;

public class CodingTest_02_Monday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt() / 4;

        for (int i = 1; i <= i1; i++) {
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
