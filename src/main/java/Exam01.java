import java.util.Scanner;

public class Exam01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //문자열 선언
        String a, b, result;
//        String c, d;
        a = sc.nextLine();
        b = sc.nextLine();
        //next()와 nextLine()의 차이는 next()는 ' '공백을 제외한 하나의 문자느낌 nextLine()은 " "공백을 포함한 한줄을 입력받는느낌

//        c = a + b;
//        d = c.toLowerCase();
//        result = d.replaceAll(" ", "");
        result = (a+b).toLowerCase().replaceAll(" ", "");
        System.out.println(result);
        sc.close();
    }
}