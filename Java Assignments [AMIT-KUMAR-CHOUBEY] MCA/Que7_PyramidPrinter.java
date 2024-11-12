import java.util.Scanner;

public class Que7_PyramidPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();
        scanner.close();

        printPyramid(n);
    }

    public static void printPyramid(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            num = 1; 
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}


