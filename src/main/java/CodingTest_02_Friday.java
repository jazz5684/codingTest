import java.util.Scanner;

public class CodingTest_02_Friday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            arr[i] = i1+i2;
        }
        for (int j : arr) {
            System.out.println(j);
        }
        

    }
}
