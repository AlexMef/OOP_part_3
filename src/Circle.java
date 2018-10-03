public class Circle implements Figure {
    private double radius;

    Circle(){
        radius = 10;
        draw();
    }

    Circle(double radius){
        this.radius = radius;
        draw();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Нарисован круг");
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
