import java.util.Scanner;
public class Code05_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 ==> ");
        int num = sc.nextInt();

        if (num >= 90) {
            pScore("A");
        } else if (num >= 80) {
            pScore("B");
        } else if (num >= 70) {
            pScore("C");
        } else if (num >= 60) {
            pScore("D");
        } else {
            pScore("f");
        }
        System.out.println("학점입니다.");
    }

    public static void pScore(String str) {
        System.out.print(str);
    }


}
