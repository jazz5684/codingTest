package week4;

import java.util.Scanner;

public class Exam10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 97; i <= 122; i++) {
            System.out.print(str.indexOf(i) + " ");
        }

    }
}
