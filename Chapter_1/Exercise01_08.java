public class Exercise01_08 {
    public static void main(String[] args) {
        double radius = 6.5;
        double pi = 3.14159;

        double perimeter = (2 * (radius * pi));
        double area = (Math.pow(radius, 2) * radius);

        System.out.println("The circle perimeter of the radius " + radius + " is " + perimeter);
        System.out.println("The circle area of the radius " + radius + " is " + area);

    }
}
