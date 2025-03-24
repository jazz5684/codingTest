import java.util.Scanner;

public class Code03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력 ==> ");
        int n1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력 ==> ");
        int n2 = sc.nextInt();
        int res;
        double res1;
        res = n1 + n2;
        System.out.println(res);

        res = n1 - n2;
        System.out.println(res);

        res = n1 * n2;
        System.out.println(res);

        res = n1 / n2;
        System.out.println(res);

        res = n1 % n2;
        System.out.println(res);

        res1 = (double) n1 / n2;
        System.out.println(res1);

        sc.close();
    }
}
