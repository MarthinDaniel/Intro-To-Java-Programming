import java.util.Scanner;
public class Exercise02_01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");
        double miles = input.nextDouble();

        double kilometer = miles * 1.6;
        System.out.printf((int) miles + " miles is %.1f kilometer", kilometer);
        input.close();
    }
}
