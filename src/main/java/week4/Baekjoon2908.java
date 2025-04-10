package week4;

import java.util.Scanner;

public class Baekjoon2908 {
    private int iA, iB;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k,inN = 0,inK = 0;
        n = sc.nextInt();
        k = sc.nextInt();

        inN = n / 100;
        inN += ((n % 100)/ 10) * 10 + (n % 10) * 100;

        inK = k / 100;
        inK += ((k % 100)/ 10) * 10 + (k % 10) * 100;

        if (inN < inK) {
            System.out.println(inK);
        } else if (inN > inK){
            System.out.println(inN);
        }

    }
}
