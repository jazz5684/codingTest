import java.util.Scanner;

public class Exam01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a, b, c;
        a = sc.next();
        b = sc.next();
        c = (a+b).toLowerCase().trim();
        System.out.println(c);
        sc.close();
    }
}