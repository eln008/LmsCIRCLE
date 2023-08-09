
public class Main {
    public static void main(String[] args) {
        double radius = 5.0;
        double circleArea = Circle.area(radius);
        double circleCircumference = Circle.circumference(radius);

        System.out.println("Площадь круга: " + circleArea);
        System.out.println("Длина окружности круга : " + circleCircumference);

    }
}