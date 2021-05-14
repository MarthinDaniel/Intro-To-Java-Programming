import java.util.Scanner;
public class Exercise02_01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles: ");
        int miles = input.nextInt();

        double kilometers = (miles * 1.6);

        System.out.printf("%d miles is %.1f kilometers", miles, kilometers);
        input.close();
    }
}