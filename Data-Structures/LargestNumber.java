import java.util.*;
public class LargestNumber{
    public static void main(String[] main){
        int max = Integer.MIN_VALUE;
        int[] array = {6, 4, 8, 1, 0, 1, 2, 3};
        for (int num : array) {
            max = Math.max(max, num);
        }

        System.out.println("Largest number in array is " + max);
    }
}