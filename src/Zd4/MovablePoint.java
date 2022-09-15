package Zd4;

public class MovablePoint implements Movable{
    /*private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    */
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("moveUp P");
    }

    @Override
    public void moveDown() {
        System.out.println("moveDown P");
    }

    @Override
    public void moveLeft() {
        System.out.println("moveLeft P");
    }

    @Override
    public void moveRight() {
        System.out.println("moveRight P");
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
