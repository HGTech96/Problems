public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorialRec(5));
    }

    public static int factorialRec (int number) {
        if (number == 0) {
            return 1;
        }
        return number*factorialRec(number - 1);
    }
}
