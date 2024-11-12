import java.util.Scanner;

public class Que1_FactorialDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        scanner.close();

        long factorial = calculateFactorial(num);
        int digitSum = calculateDigitSum(factorial);

        System.out.println(num + "! = " + factorial);
        System.out.println("Sum of digits: " + digitSum);
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int calculateDigitSum(long num) {
        int sum = 0;
        String strNum = String.valueOf(num);
        for (char c : strNum.toCharArray()) {
            sum += Character.getNumericValue(c);
        }
        return sum;
    }
}


