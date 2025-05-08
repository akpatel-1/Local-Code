import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        System.out.print("Enter " + size + " sorted numbers in the array separated by space: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        System.out.print("Enter the number you want to search: ");
        int key = scan.nextInt();

        int index = getBinarySearch(array, key);
        if (index >= 0) {
            System.out.println(key + " found at index number: " + index);
        } else {
            System.out.println("Element not found!");
        }

        scan.close(); 
    }

    public static int getBinarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; 
            if (array[mid] == key) { 
                return mid; 
            } else if (array[mid] < key) { 
                low = mid + 1;
            } else { 
                high = mid - 1;
            }
        }
        return -1; 
    }
}