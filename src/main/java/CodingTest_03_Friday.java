import java.util.Scanner;

public class CodingTest_03_Friday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        for (int i = 1; i <= n; i++) {
            t += i;
        }
        System.out.println(t);
    }
}
