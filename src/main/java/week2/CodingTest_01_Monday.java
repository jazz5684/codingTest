package week2;

import java.util.Scanner;

public class CodingTest_01_Monday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int n = sc.nextInt();

        int price1, n1, allPrice = 0;
        for (int i = 1; i <= n; i++) {
            price1 = sc.nextInt();
            n1 = sc.nextInt();
            allPrice += price1 * n1;

        }

        if (price == allPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
