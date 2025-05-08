
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        System.out.print("Enter " + size + " numbers in the array separated by space: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.print("Enter the number you want to search: ");
        int key = scan.nextInt();

        int index = getLinearSearch(array, key);
        if (index >= 0) {
            System.out.println(key + " found at index number: " + index);
        } else {
            System.out.println("Element not found!");
        }

        scan.close(); 
    }

    public static int getLinearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i;
            }
        }
        return -1;
    }
}

/*
LEARNING
The Scanner reads the next integer token from the input, and it treats any whitespace (including spaces, tabs, and newlines) as delimiters (separators) between tokens by default. */
