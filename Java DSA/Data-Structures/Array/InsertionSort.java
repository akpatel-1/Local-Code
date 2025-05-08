import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter " + size + " numbers in the array separated by space: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        getInsertionSort(array);
        System.out.print("Insertion sorted array: ");
        display(array);
        scan.close(); 
    }

    public static void getInsertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
        int curr = array[i];
        int prev = i - 1;
        while (prev >= 0 && array[prev] > curr) {
            array[prev + 1] = array[prev];
            prev--;
        }
        array[prev + 1] = curr;
    }
}
    

    public static void display(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
