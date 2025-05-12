import java.util.*;
public class CountingSort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] array = new int[size];
        System.out.print("Enter " + size + " numbers in the array separated by space: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        getCountingSort(array);
        System.out.print("Insertion sorted array: ");
        display(array);
        scan.close(); 
    }

    public static void getCountingSort(int[] array) {
    int max = Integer.MIN_VALUE;
    for (int num : array) {
        max = Math.max(max, num);
    }
    int[] count = new int[max + 1];
    for (int num : array) {
        count[num]++;
    }
    int j = 0;
    for (int i = 0; i < count.length; i++) {
        while (count[i] > 0) {
            array[j] = i;
            j++;
            count[i]--;
        }
    }
}

    

    public static void display(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
