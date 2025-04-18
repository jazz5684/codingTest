package middleTest;

//Fish를 상속받은 GoldFish를 상속
public class Test04 extends GoldFish{
    public static void main(String[] args) {
        //GoldFish 클래스를 호출
        GoldFish gf = new GoldFish();
        //헤엄치고 있습니다를 출력.
        gf.swim();
    }
}
