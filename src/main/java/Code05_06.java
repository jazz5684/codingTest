import java.util.Scanner;

public class Code05_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 ==> ");
        int num = sc.nextInt();

        if (num > 100) {
            if (num < 1000) {
                System.out.println("100보다 크고 1000보다 작군요");
            } else {
                System.out.println("와~ 1000보다 크군요");
            }
        } else {
            System.out.println("100보다 작다");
        }
        sc.close();
    }
}
