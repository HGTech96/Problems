public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonaciRecursion(7));
        System.out.println(fibonaciIteration(7));
    }

    public static int fibonaciRecursion (int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        return fibonaciRecursion(number-1) + fibonaciRecursion(number - 2);
    }

    public static int fibonaciIteration (int number) {
        if (number == 1 || number == 2) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci=0;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return fibonacci;
    }
}
