import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        long sum = findSumOfPrimes(N);

        System.out.println("Sum of prime numbers not greater than " + N + ": " + sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static long findSumOfPrimes(int N) {
        long sum = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
