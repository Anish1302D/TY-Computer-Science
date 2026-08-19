import java.util.Scanner;

public class PasswordChecker 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        int digits = 0;
        int uppercase = 0;

        for (int i = 0; i < password.length(); i++) 
        {
            char ch = password.charAt(i);
            
            if (Character.isDigit(ch)) digits++;
            if (Character.isUpperCase(ch)) uppercase++;
        }

        System.out.println("a. Password length: " + password.length());
        System.out.println("b. Number of digits: " + digits);
        System.out.println("c. Number of uppercase letters: " + uppercase);
        System.out.println("d. At least 8 characters: " + (password.length() >= 8));

        scanner.close();
    }
}
