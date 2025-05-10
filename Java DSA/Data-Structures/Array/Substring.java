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
        String temp = "";
        for(int i=start-1; i<end; i++){
            temp += str.charAt(i);
        }
        return temp;
    }
}
