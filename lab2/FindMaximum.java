public class FindMaximum {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[2]);

        int biggerOne = number1 > number2 ? number1 : number2;
        System.out.println("The max is " + biggerOne);
    }
}
