package week3;

import java.util.Scanner;

public class CodingTest_02_Monday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1, i2;

        while (sc.hasNextInt()) {
            i1 = sc.nextInt();
            i2 = sc.nextInt();
            System.out.println(i1+i2);

        }
        sc.close();
    }
}
