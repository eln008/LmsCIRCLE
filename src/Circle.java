public class Circle {
    public static final double PI = 3.141592653589793;

    public static double area(double radius) {
        return PI * (radius * radius);
    }

    public static double circumference(double radius) {
        return PI * 2 * radius;
    }
}
