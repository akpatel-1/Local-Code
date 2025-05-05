import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter " + size + " numbers in the array separated by space: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        getSelectionSort(array);
        System.out.print("Bubble sorted array: ");
        display(array);
        scan.close(); 
    }

        public static void getSelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }
        }
    }     

    public static void display(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}