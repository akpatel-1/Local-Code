public class ArrayArgument{
    public static void main(String[] args){
        int[] arr = new int[10];
        display(arr);
        modify(arr);
        display(arr);
    }
    public static void display(int[] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int[] modify(int[] array){
        for(int i=0; i<array.length; i++){
            array[i] += 1;
        }
        return array;
    }
}