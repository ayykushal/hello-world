import java.util.Scanner;

public class LetterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for input
        System.out.println("Please enter a string: ");
        String input = scanner.nextLine();
        
        // Initialize the letter count
        int letterCount = 0;
        
        // Loop through each character in the input string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                letterCount++;
            }
        }
        
        // Print the number of letters
        System.out.println("The number of letters in the string is: " + letterCount);
        
        scanner.close();
    }
}
