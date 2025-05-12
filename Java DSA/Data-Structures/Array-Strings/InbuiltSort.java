import java.util.*;

public class InbuiltSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter " + size + " numbers in the array separated by space: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        getInbuiltSort(array);
        System.out.print("Inbuilt sorted array: ");
        display(array);
        scan.close(); 
    }

        public static void getInbuiltSort(int[] array) {
        Arrays.sort(array);
    }     

    public static void display(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}