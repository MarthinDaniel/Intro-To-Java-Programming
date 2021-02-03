import java.util.Scanner;
public class Exercise02_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number in square meters: ");
        double meters = input.nextDouble();

        double ping = meters *  0.3025;
        System.out.println(meters + " square meter is " + ping + " pings.");
        input.close();
    }
}
