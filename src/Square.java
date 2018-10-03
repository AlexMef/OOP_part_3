public class Square implements Figure {
    private double side;

    Square(){
        side = 10;
        draw();
    }

    Square(double side){
        this.side = side;
        draw();
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован квадрат");
    }

    @Override
    public double getPerimeter() {
        return side*4;
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
