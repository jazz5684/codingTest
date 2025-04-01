package week3;

import java.util.Scanner;

public class CodingTest_01_Monday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] arr = new int[i];
        int q = 0;
        for (int j = 0; j < i; j++) {
            arr[j] = sc.nextInt();
        }
        int k = sc.nextInt();

        for (int o = 0; o < arr.length; o++) {
            if(arr[o] == k) {
                q++;
            }
        }
        System.out.println(q);

        
    }
}
