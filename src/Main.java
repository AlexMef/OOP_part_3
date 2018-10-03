import java.text.Format;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Square square1 = new Square(5);

        System.out.printf("Периметр квадрата = %.2f, Площадь квадрата = %.2f \n",square1.getPerimeter(), square1.getArea());
        System.out.printf("Периметр круга = %.2f, Площадь круга = %.2f \n",circle1.getPerimeter(), circle1.getArea());

        ArrayList<Figure> arrayList = new ArrayList<>();
        arrayList.add(circle1);
        arrayList.add(square1);

        for (Figure a: arrayList) {
            System.out.println(a.getPerimeter());
        }

    }
}
