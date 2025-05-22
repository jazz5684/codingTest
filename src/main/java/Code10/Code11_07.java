package Code10;

public class Code11_07 {
    public static void main(String[] args) {
        int[] arr={10,20,30};

        try{
            arr[3] = 1234/0;
            arr[3] = 1234;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자 오류");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누는 등의 수식 오류입니다.");
        }finally {
            System.out.println("이부분무조건보여용");
        }
    }
}
