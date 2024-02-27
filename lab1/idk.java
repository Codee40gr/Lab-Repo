import java.util.*;

public class question{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me two number!");
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        System.out.println("What is the operation?");
        String ope = sc.next();
        System.out.println("Your result is: " + Calculator(first, ope, second));
        sc.close();
    }

    public static double Calculator(double a, String operation, double b){
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.println("Please give an valid operation style!");
                return 0;
                
        }

    }
}
