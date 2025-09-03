package Arrays;

import java.util.Scanner;

public class NiceBadArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.print("Enter the elements of the array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Check array type
        if(isNiceArray(arr)) {
            System.out.println("Nice Array");
        } else {
            System.out.println("Bad Array");
        }

        scanner.close();
    }

    public static boolean isNiceArray(int[] arr) {
        boolean hasEven = false;
        boolean hasOdd = false;

        for (int num : arr) {
            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }

            // If both even and odd are found, it's a bad array
            if (hasEven && hasOdd) {
                return false;
            }
        }

        return true; // Only even or only odd numbers
    }
}

