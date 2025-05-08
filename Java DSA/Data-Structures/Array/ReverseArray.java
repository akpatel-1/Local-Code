import java.util.Scanner;
public class ReverseArray{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();

        int[] array = new int[size];

        System.out.print("Enter " + size + " numbers in the array separated by space: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        getReversedArray(array);
        System.out.print("Reversed array is : ");
        display(array);
        scan.close(); 
    }
    public static int[] getReversedArray(int[] array){
        for(int i=0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = temp;
        }
        return array;
    }
    public static void display(int[] array){
        for(int arr:array){
            System.out.print(arr + " ");
        }
    }

}