public class Code04_13 {
    public static void main(String[] args) {
        String str= "  한글  ABCD   efgh   ";
        String cuStr = "";
        String reStr = "";
        boolean res;

        cuStr = str.trim();
        reStr = str.replaceAll(" ", "");
        res = str.isEmpty(); //문자열에 값이 존재화는지 확인 (boolean)
        boolean res2 = str.length() == 0;

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("앞뒤 공백 제거 ==> [" + cuStr + "]");
        System.out.println("전체 공백 제거 ==> [" + reStr + "]");
        System.out.println(res);
        System.out.println(res2);
    }
}
