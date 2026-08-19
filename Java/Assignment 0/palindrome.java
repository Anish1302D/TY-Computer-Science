import java.util.Scanner;

public class palindrome 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();

        // 1. String Logic: Clean spaces/case, reverse, and compare
        String clean = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String revStr = new StringBuilder(clean).reverse().toString();
        boolean isStrPal = clean.equals(revStr);

        // 2. Number Logic: Reverse mathematically and compare (if numeric)
        boolean isNumPal = false;
        if (input.matches("\\d+")) 
        {
            int num = Integer.parseInt(input), orig = num, revNum = 0;
            while (num > 0) {
                revNum = (revNum * 10) + (num % 10);
                num /= 10;
            }
            isNumPal = (orig == revNum);
        }

        System.out.println("As String Palindrome: " + isStrPal);
        if (input.matches("\\d+")) System.out.println("As Number Palindrome: " + isNumPal);
        scanner.close();
    }
}
