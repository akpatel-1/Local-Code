public class LargestNumber{
    public static void main(String[] main){
        int max = 0;
        int[] array = {6, 4, 8, 9, 0, 1, 2, 3};
        for(int i=0; i<array.length; i++){
            max = Math.max(max, array[i]);
        }
        System.out.println("Largest number in array is " + max);
    }
}