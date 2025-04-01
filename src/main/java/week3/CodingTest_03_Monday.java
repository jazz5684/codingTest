package week3;

import java.util.Scanner;

public class CodingTest_03_Monday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        int[] arr = new int[n1];
        for(int i=0; i<n1; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i< arr.length; i++) {
            if(arr[i] < n2) {
                System.out.print(arr[i]+" ");
            }
        }
        sc.close();

    }
}
