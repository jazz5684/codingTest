import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("이협건");
        list.add("홍길동");
        list.add("얌꺽정");
        list.add("고길동");

        int listSize = list.size();

        System.out.println("저장된 데이터 수: " + listSize);

        //1세대
        //단점 : 반드시 반복의 횟수를 알고 있어야 사용 가능함
        System.out.println("1세대 반복문");

        for (int i = 0; i < listSize; i++) {
            System.out.println("이름 : " + list.get(i));
        }

        //2세대
        //장점 : 1 세대 반복문의 단점인 반드시 반복의 횟수를 알고 있어야 하는 반복문의 문제점을 개선함
        System.out.println("2세대 반복문");

        for (String name : list) {
            System.out.println("이름 : " + name);
        }

        //3세대
        //장점 :2세대 보다 코딩해야하는 줄(라인)이 감소함, 람다식 적용, 자바 1.8부터 사용가능
        System.out.println("3세대 반복문");
        list.forEach(name -> System.out.println("name : " + name));

        //4세대
        //장점 : 3세대에 비동기식 처리 방법
        //단점 : 처리 완료가 누가 먼저 될지 알 수가 없음. 따라서 모든 경우에 다 쓸 수 없음
        System.out.println("4세대 반복문");
        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        //while 반복문 --1.5세대 for 박ㄴ복문 1세대보다 처리 속도가 빠름
        //자바 1.7까지 가장 많이 쓰던 반복문

        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            String name = it.next();
            System.out.println("next : " + name);
        }
    }
}
