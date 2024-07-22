import java.util.Random;
import java.util.*;

public class task4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Prompt user to enter the desired length of the password
        System.out.print("Enter the desired length of the password: ");
        int length = sc.nextInt();

        // Prompt user to specify the character types
        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = sc.next().toLowerCase().charAt(0) == 'y';
        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowercase = sc.next().toLowerCase().charAt(0) == 'y';
        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUppercase = sc.next().toLowerCase().charAt(0) == 'y';
        System.out.print("Include special characters? (y/n): ");
        boolean includeSpecialChars = sc.next().toLowerCase().charAt(0) == 'y';

        // Character pools for different types of characters
        String numbers = "0123456789";
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String specialChars = "!@#$%^&*()-_+=<>?";

        // Create a pool of characters based on user preferences
        StringBuilder characterPool = new StringBuilder();
        if (includeNumbers) {
            characterPool.append(numbers);
        }
        if (includeLowercase) {
            characterPool.append(lowercase);
        }
        if (includeUppercase) {
            characterPool.append(uppercase);
        }
        if (includeSpecialChars) {
            characterPool.append(specialChars);
        }

        // Check if character pool is not empty
        if (characterPool.length() == 0) {
            System.out.println("No character types selected. Unable to generate password.");
            return;
        }

        // Generate the password
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        // Display the generated password
        System.out.println("Generated password: " + password.toString());
    }
}
