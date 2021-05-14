import java.util.Scanner;

public class Exercise02_02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of the sides and height of the equilateral triangle: ");
        double sides = input.nextDouble();

        double area = (Math.pow(3, 0.5) / 4) * (sides * sides);
        double volume = area * sides;

        System.out.printf("The area is %.1f \n", area);
        System.out.printf("The volume of the Triangular prism is %.2f", volume);
    }
}