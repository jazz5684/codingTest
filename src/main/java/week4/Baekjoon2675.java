package week4;

import java.util.Scanner;

public class Baekjoon2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inN[] = new int[n];
        String str[] = new String[n];
        for(int i = 0; i < n; i++) {
            inN[i] = sc.nextInt();
            str[i] = sc.next();
        }

        for(int i = 0; i <= str.length - 1; i++) {
            for (int j = 0; j <= str[i].length() - 1; j++) {
                for(int k = 0; k < inN[i]; k++){
                    System.out.print(str[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
