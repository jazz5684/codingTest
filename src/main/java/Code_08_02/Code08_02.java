package Code_08_02;
class Rabbit{
    String shape;
    int xPos;
    int yPos;

    void move(int x,int y){
        this.xPos=x;
        this.yPos=y;

        System.out.println(xPos+","+yPos);
    }
}

class HouseRabbit extends Rabbit{
    String owner;
    void eatFeed(){
        System.out.println("집토끼가 사료를 먹는다.");
    }

    @Override
    void move(int x, int y) {
        System.out.println("재 정의 된 함수다.");;
    }

}

class MountainRabbit extends Rabbit{
    String mountain;
    void eatWildglass() {
        System.out.println("산토끼가 풀을 먹습니다.");
    }
}

public class Code08_02 {
    public static void main(String[] args) {
        HouseRabbit hRabbit = new HouseRabbit();
        MountainRabbit mRabbit = new MountainRabbit();

        hRabbit.shape = "삼각형";
        hRabbit.owner = "난생이";
        hRabbit.move(100, 100);
        hRabbit.eatFeed();

        mRabbit.shape = "네모";
        mRabbit.mountain = "설악산";
        mRabbit.move(200, 200);
        mRabbit.eatWildglass();

    }
}
