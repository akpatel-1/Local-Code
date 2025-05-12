import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class InbuiltReverseSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        Integer[] array = new Integer[size];
        System.out.print("Enter " + size + " numbers in the array separated by space: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        getInbuiltReverseSort(array);
        System.out.print("Inbuilt Reverse sorted array: ");
        display(array);
        scan.close(); 
    }

        public static void getInbuiltReverseSort(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }     

    public static void display(Integer[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}