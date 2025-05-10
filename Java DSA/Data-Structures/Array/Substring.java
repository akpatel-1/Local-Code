import java.util.*;
public class Substring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = scan.next();
        System.out.print("\nEnter substring index seprated by space: ");
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.println(str + " substring is " + getSubstring(str, start, end));
        scan.close();
    }
    public static String getSubstring(String str, int start, int end){
        // String temp = "";
        // for(int i=start-1; i<end; i++){
        //     temp += str.charAt(i);
        //temp + str.charAt(i);
        // Then nothing gets stored. The result of temp + str.charAt(i) is computed (i.e., a new String is created by appending the character), but you don't assign it back to anything. So it’s effectively discarded.
        // }
        // return temp;

         return str.substring(start, end);
    }
}
