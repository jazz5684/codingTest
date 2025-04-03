package week3;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTest_02_Wednesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        arr = Arrays.stream(arr).distinct().toArray();
        sc.close();
        System.out.println(arr.length);

    }
}
