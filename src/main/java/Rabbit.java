public class Rabbit {
    String shape;
    int xPos;
    int yPos;
    
    Rabbit() {
        System.out.println("자동으로 만들어주는 생성자");
    }
    
    Rabbit(String value) {
        shape = value;
    }

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
        System.out.println(xPos + " " + yPos);
    }
}

