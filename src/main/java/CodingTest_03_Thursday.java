import java.util.Scanner;

public class CodingTest_03_Thursday {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a == b && a == c) {
            System.out.println(10000 + a * 1000);
        } else if(a == b && a != c || a == c && a != b) {
            System.out.println(1000 + a * 100);
        } else if(b == c && b != a){
            System.out.println(1000 + b * 100);
        }else {
            int m = a;
            if (m < b) m = b;
            if (m < c) m = c;
            System.out.println(m * 100);
        }
    }
}
