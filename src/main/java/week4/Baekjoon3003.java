package week4;

import java.util.Scanner;

public class Baekjoon3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] pieces = new int[6];

        for (int i = 0; i < 6; i++) {
            pieces[i] = sc.nextInt();
        }
        for (int i = 0; i < pieces.length; i++) {
            if (i == 0 || i == 1 ) {
                if (pieces[0] == 1){
                    System.out.println(pieces[0]);
//                } else if (pieces[0] ){
              }
            }
        }


    }
}
