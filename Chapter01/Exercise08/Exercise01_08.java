public class Exercise01_08{
    public static void main(String[] args) {
        final double PI = 3.14159;
        double radius = 6.5;

        double perimeter = 2 * radius * PI;
        double area = (Math.pow(radius, 2)) * PI;

        System.out.println("The perimeter of the radius " + " is " + perimeter);
        System.out.println("The area of the radius " + radius + " is " + area);
    }
}