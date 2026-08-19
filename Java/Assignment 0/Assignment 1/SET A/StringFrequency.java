import java.util.Scanner;

public class StringFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Remove leading and trailing spaces
        sentence = sentence.trim();

        int words = 0;
        int alphabets = 0;
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int specialCharacters = 0;

        // Frequency of vowels
        int aCount = 0;
        int eCount = 0;
        int iCount = 0;
        int oCount = 0;
        int uCount = 0;

        // Frequency of each alphabet
        int[] alphabetFrequency = new int[26];

        // Count characters
        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                alphabets++;

                char lower = Character.toLowerCase(ch);

                // Count alphabet frequency
                alphabetFrequency[lower - 'a']++;

                // Count vowels
                switch (lower) {
                    case 'a':
                        vowels++;
                        aCount++;
                        break;

                    case 'e':
                        vowels++;
                        eCount++;
                        break;

                    case 'i':
                        vowels++;
                        iCount++;
                        break;

                    case 'o':
                        vowels++;
                        oCount++;
                        break;

                    case 'u':
                        vowels++;
                        uCount++;
                        break;

                    default:
                        consonants++;
                }

            } else if (Character.isDigit(ch)) {
                digits++;

            } else if (ch == ' ') {
                spaces++;

            } else {
                specialCharacters++;
            }
        }

        // Count words
        if (!sentence.isEmpty()) {
            String[] wordArray = sentence.split("\\s+");
            words = wordArray.length;
        }

        // Find most frequent alphabet
        int maxFrequency = 0;
        char mostFrequentAlphabet = '-';

        for (int i = 0; i < 26; i++) {
            if (alphabetFrequency[i] > maxFrequency) {
                maxFrequency = alphabetFrequency[i];
                mostFrequentAlphabet = (char) ('a' + i);
            }
        }

        // Display results
        System.out.println("\n========== STRING FREQUENCY REPORT ==========");
        System.out.println("Trimmed Sentence       : " + sentence);
        System.out.println("---------------------------------------------");

        System.out.println("Total Words            : " + words);
        System.out.println("Total Alphabets        : " + alphabets);
        System.out.println("Total Vowels           : " + vowels);
        System.out.println("Total Consonants       : " + consonants);
        System.out.println("Total Digits           : " + digits);
        System.out.println("Total Spaces           : " + spaces);
        System.out.println("Special Characters     : " + specialCharacters);

        System.out.println("\nVowel Frequency:");
        System.out.println("A : " + aCount);
        System.out.println("E : " + eCount);
        System.out.println("I : " + iCount);
        System.out.println("O : " + oCount);
        System.out.println("U : " + uCount);

        if (maxFrequency > 0) {
            System.out.println("\nMost Frequent Alphabet : "
                    + Character.toUpperCase(mostFrequentAlphabet)
                    + " (" + maxFrequency + " times)");
        } else {
            System.out.println("\nMost Frequent Alphabet : No alphabets found");
        }

        // Convert all vowels to uppercase
        StringBuilder modifiedSentence = new StringBuilder();

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    modifiedSentence.append(
                            Character.toUpperCase(ch)
                    );
                    break;

                default:
                    modifiedSentence.append(ch);
            }
        }

        System.out.println("\nModified Sentence:");
        System.out.println(modifiedSentence);

        System.out.println("=============================================");

        sc.close();
    }
}
