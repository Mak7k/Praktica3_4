package Zd4;

public class MoveRectangle extends MovablePoint implements Movable{
    MovablePoint topleft;
    MovablePoint bottomright;

    public MoveRectangle(int x1, int y1, int x2, int y2, int xSpeed1, int ySpeed1, int xSpeed2, int ySpeed2) {
        topleft.x = x1;
        topleft.y = y1;
        topleft.xSpeed = xSpeed1;
        topleft.ySpeed = ySpeed1;
        bottomright.x = x2;
        bottomright.y = y2;
        bottomright.xSpeed = xSpeed2;
        bottomright.ySpeed = ySpeed2;
    }

    @Override
    public String toString() {
        return "MoveRectangle{" +
                "topleft=" + topleft +
                ", bottomright=" + bottomright +
                '}';
    }

    @Override
    public void moveUp() {
        if (topleft.ySpeed == bottomright.ySpeed){
            System.out.println("MoveUp - Rectangle");
        }
    }

    @Override
    public void moveDown() {
        if (topleft.ySpeed == bottomright.ySpeed){
            System.out.println("MoveDown - Rectangle");
        }
    }

    @Override
    public void moveLeft() {
        if (topleft.xSpeed == bottomright.xSpeed){
            System.out.println("MoveLeft - Rectangle");
        }
    }

    @Override
    public void moveRight() {
        if (topleft.xSpeed == bottomright.xSpeed){
            System.out.println("MoveRight - Rectangle");
        }
    }
}
