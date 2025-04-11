public class Rabbit {
    String shape;
    int xPos;
    int yPos;

    Rabbit(String value) {
        shape = value;
    }

    void setPosition(int x, int y) {
        xPos = x;
        yPos = y;
        System.out.println(xPos + " " + yPos);
    }
}

