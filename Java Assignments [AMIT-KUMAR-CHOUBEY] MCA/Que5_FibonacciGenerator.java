import java.util.Scanner;

public class Que5_FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        scanner.close();

        long[] fibonacci = generateFibonacci(n);

        System.out.println("Fibonacci sequence:");
        printArray(fibonacci);
    }

        public static long[] generateFibonacci(int n) {
        long[] fibonacci = new long[n];
        if (n >= 1) {
            fibonacci[0] = 0;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
    }

        public static void printArray(long[] arr) {
        for (long num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


