package Chapter9;

import java.util.Scanner;

public class Code_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numAry = new int[4];
        int hap = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("숫자 : ");
            numAry[i] = sc.nextInt();
        }

        for (int i = 0; i < numAry.length; i++) {
            hap += numAry[i];
        }
        System.out.println("합계 ==> " + hap);
        sc.close();
    }
}
