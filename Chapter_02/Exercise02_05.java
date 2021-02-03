import java.util.Scanner;
public class Exercise02_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and graturity rate: ");
        double subtotal = input.nextDouble();
        double graturityRate = input.nextDouble();

        double graturity = subtotal * (graturityRate / 100);
        double total = subtotal + graturity;

        System.out.println("The graturity is $" + graturity + " and the total is $" + total);
        input.close();
    }
}
