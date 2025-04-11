package week4;

import java.util.Scanner;

public class Baekjoon5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = 0;
        for (int i = 0; i < s.length(); i++) {
            x += 2;
            //2
            if (s.charAt(i) >= 65 && s.charAt(i) <= 67) {
                x += 1;
//                3
            } else if (s.charAt(i) >= 68 && s.charAt(i) <= 70) {
                x += 2;
//                4
            } else if (s.charAt(i) >= 71 && s.charAt(i) <= 73) {
                x += 3;
//                5
            } else if (s.charAt(i) >= 74 && s.charAt(i) <= 76) {
                x += 4;
//                6
            } else if (s.charAt(i) >= 77 && s.charAt(i) <= 79) {
                x += 5;
                //7
            } else if (s.charAt(i) >= 80 && s.charAt(i) <= 83) {
                x += 6;
                //8
            } else if (s.charAt(i) >= 84 && s.charAt(i) <= 86) {
                x += 7;
                //9
            } else if (s.charAt(i) >= 87 && s.charAt(i) <= 90) {
                x += 8;
            }
        }
        System.out.println(x);
    }
}
