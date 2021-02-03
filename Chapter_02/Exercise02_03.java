import java.util.Scanner;
public class Exercise02_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for meter: ");
        double meters = input.nextDouble();

        double miles = meters *  3.2786;
        
        System.out.println(meters + " meters is " + miles + " miles.");
        input.close();
    }
}
