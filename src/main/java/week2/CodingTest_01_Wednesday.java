package week2;

import java.util.Scanner;

public class CodingTest_01_Wednesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int j = 1; j <= i; j++) {
            for(int k = 1; k <= j; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
