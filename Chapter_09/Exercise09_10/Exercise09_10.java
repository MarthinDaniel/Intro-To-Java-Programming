import java.util.Scanner;

public class Exercise09_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticExpression quadraticExpression = new QuadraticExpression(a, b, c);

        System.out.println("The equations has: ");
        if (quadraticExpression.getDiscriminant() < 0){
            System.out.println("No real roots");
        }
        else if (quadraticExpression.getDiscriminant() > 0){
            System.out.println("two roots " + quadraticExpression.getRoot1() + " and " + quadraticExpression.getRoot2());
        }
        else{
            System.out.println("one root " + (quadraticExpression.getRoot1() > 0 ? quadraticExpression.getRoot1() : quadraticExpression.getRoot2()));
        }
        input.close();
    }
}
