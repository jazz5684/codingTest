package week3;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTest_01_Tuesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int[] i2 = new int[i1];
        for (int j = 0; j < i1; j++) {
            i2[j] = sc.nextInt();
        }
        Arrays.sort(i2);
        System.out.println(i2[0] + " " + i2[i1-1]);
        sc.close();
    }
}
