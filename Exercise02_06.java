import java.util.Scanner;
public class Exercise02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number between 0 - 999: ");
        int numberInput = input.nextInt();

        int temp1 = numberInput % 10;
        int temp2 = numberInput / 10;
        int temp3 = temp2 % 10;
        int temp4 = temp2 / 10;
        int temp5 = temp4 % 10;

        int answer = temp1 * temp3 * temp5;
        System.out.println("The multiplication of all digits in " + numberInput + " is " + answer);
        input.close();
    }
}
