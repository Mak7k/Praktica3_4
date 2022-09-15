public class Square extends Rectangle{
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.setSide(side);
    }

    public Square(double side, String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
        this.setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setWidth(double side){
        this.setWidth(side);
    }

    public void setLength(double side){
        this.setLength(side);
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
