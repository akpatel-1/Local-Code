import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.next();
        System.out.println("is " + str + " palindrome: " + isPalindrome(str));
        scan.close;
    }
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<=n/2; i++){
            if(str.charAt(i)==str.charAt(n-i-1)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
