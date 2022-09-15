package Zd4;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }


    @Override
    public void moveUp() {
        System.out.println("moveUp C");
    }

    @Override
    public void moveDown() {
        System.out.println("moveDown C");
    }

    @Override
    public void moveLeft() {
        System.out.println("moveLeft C");
    }

    @Override
    public void moveRight() {
        System.out.println("moveRight C");
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
