package middleTest;

//Fish를 상속
public class GoldFish extends Fish {
    //재정의
    @Override
    void swim() {
        System.out.println("헤엄치고 있습니다.");
    }
}
