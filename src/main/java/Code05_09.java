import java.util.Scanner;

public class Code05_09 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int select;

        System.out.print("1~3중에 선택하세요 : ");
        select = s.nextInt();

        switch (select) {
            case 1:
                System.out.println("1을 선택");
                break;
            case 2:
                System.out.println("2를 선택");
                break;
            case 3:
                System.out.println("3을 선택");
                break;
            default:
                System.out.println("알 수 없는 값입니다.");
        }
        s.close();
    }
}
