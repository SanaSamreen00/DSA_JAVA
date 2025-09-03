package Arrays;

public class arraylength {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Find the length of the array
        int length = numbers.length;

        // Print the array elements
        System.out.print("Array elements: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Print the length of the array
        System.out.println("\nLength of the array: " + length);
    }
}
