package Code10;

public class Code10_04 {
    static int para2_method(int v1, int v2) {
        int result = 0;
        result = v1 + v2;
        return result;
    }
    public int para2_method2(int v1, int v2) {
        int result = 0;
        result = v1 + v2;
        return result;
    }

    public static void main(String[] args) {
        int hap;
        Code10_04 code = new Code10_04();
        hap = para2_method(10, 20);
        System.out.println("매개변수 2개 메서드 호출 결과 ==> " + hap);
        hap = code.para2_method2(10, 20);
    }

}
