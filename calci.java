import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        System.out.println("1.Addittion 2.Subtraction 3.Multiplication 4.Division");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result: " + (a + b)); break;
            case 2: System.out.println("Result: " + (a - b)); break;
            case 3: System.out.println("Result: " + (a * b)); break;
            case 4: System.out.println("Result: " + (a / b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}
