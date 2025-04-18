package middleTest;

public class Test01 {
    public static void main(String[] args) {
        int max = 7;
        for (int i = 1; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j < i*2; j++) {
                System.out.print("*");
            }


            System.out.println();
        }
    }
}

