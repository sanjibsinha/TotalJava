package fun.sanjibsinha;

class Fly{
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Fly(int x, int y){
        this.x = x;
        this.y = y;
    }
}

class Aircraft{
    private int seat;
    Fly flying;

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Aircraft(int seats, Fly flying){
        this.seat = seats;
        this.flying = flying;
    }
}

public class ClassType {

    public static void main(String[] args) {
        Aircraft air1 = new Aircraft(10, new Fly(10, 20));
        System.out.println(air1.getSeat() + air1.flying.x + air1.flying.y);
    }

}
