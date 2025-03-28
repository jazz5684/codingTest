import java.util.Scanner;

public class Code03_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scroe;

        System.out.println("필기시험 점수를 입력하세요: ");
        scroe = sc.nextInt();
        System.out.println(scroe >= 70);

        sc.close();
    }
}
