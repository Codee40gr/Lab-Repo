public class CompareNumbers {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        if (number1 < number2){
            System.out.println(number2 + " is bigger than " + number1);
        }
        else{
            System.out.println(number1 + " is bigger than " + number2);

        }
    }
}
