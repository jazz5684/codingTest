package week2;

import java.util.Scanner;

public class CodingTest_02_Wednesday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        // j=1로시작 입력받은값이 될때까지
        for (int j = 1; j <= i; j++) {
            //공백칸이 들어갈곳 입력값이 만약 5라면 4, 7이라면 6 입력값이 i라했을때 공백이 필요한칸은 i-1 = k 점점 작아진다
            for (int k = 1; k <= i-j; k++) {
                System.out.print(" ");
            }
            for (int l = 1; l < j; l++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
