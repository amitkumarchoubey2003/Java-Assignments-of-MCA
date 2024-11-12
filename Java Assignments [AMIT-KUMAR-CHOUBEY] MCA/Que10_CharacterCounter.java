import java.util.Scanner;

public class Que10_CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        System.out.print("Enter a character to search for: ");
        char searchChar = scanner.next().charAt(0);

        scanner.close();

        int count = countCharacterOccurrences(inputString, searchChar);

        System.out.println("The character '" + searchChar + "' occurs " + count + " times in the string.");
    }

    public static int countCharacterOccurrences(String str, char c) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == c) {
                count++;
            }
        }
        return count;
    }
}


