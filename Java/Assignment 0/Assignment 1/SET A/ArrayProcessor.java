import java.util.Scanner;

public class ArrayProcessor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Accept number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("At least 2 elements are required.");
            sc.close();
            return;
        }

        int[] arr = new int[n];

        // Accept array elements
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display original array
        System.out.print("\nOriginal Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Find largest and smallest
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        // Find second largest distinct element
        int secondLargest = 0;
        boolean foundSecondLargest = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] != largest) {

                if (!foundSecondLargest || arr[i] > secondLargest) {
                    secondLargest = arr[i];
                    foundSecondLargest = true;
                }
            }
        }

        // Find second smallest distinct element
        int secondSmallest = 0;
        boolean foundSecondSmallest = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] != smallest) {

                if (!foundSecondSmallest || arr[i] < secondSmallest) {
                    secondSmallest = arr[i];
                    foundSecondSmallest = true;
                }
            }
        }

        // Display second largest and second smallest
        System.out.println();

        if (foundSecondLargest) {
            System.out.println("Second Largest Distinct Element: "
                    + secondLargest);
        } else {
            System.out.println("Second Largest Distinct Element: Not available");
        }

        if (foundSecondSmallest) {
            System.out.println("Second Smallest Distinct Element: "
                    + secondSmallest);
        } else {
            System.out.println("Second Smallest Distinct Element: Not available");
        }

        // Find duplicate elements and their frequencies
        System.out.println("\nDuplicate Elements and Frequencies:");

        boolean duplicateFound = false;

        for (int i = 0; i < n; i++) {

            // Check whether this element appeared earlier
            boolean alreadyChecked = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyChecked = true;
                    break;
                }
            }

            if (alreadyChecked) {
                continue;
            }

            // Count frequency
            int frequency = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }

            if (frequency > 1) {
                System.out.println(arr[i] + " -> " + frequency + " times");
                duplicateFound = true;
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicate elements found.");
        }

        // Count unique elements
        int uniqueElements = 0;

        for (int i = 0; i < n; i++) {

            boolean alreadyCounted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                uniqueElements++;
            }
        }

        System.out.println("\nNumber of Unique Elements: "
                + uniqueElements);

        sc.close();
    }
}
