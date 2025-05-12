import java.util.*;

public class StringUppercase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Sentence: ");
        StringBuilder str = new StringBuilder(scan.nextLine().trim());
        System.out.println("First uppercase sentence: " + getUppercase(str));
    }

    public static StringBuilder getUppercase(StringBuilder str) {
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && Character.isLetter(str.charAt(i))) {
                str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            } 
            else if (str.charAt(i) == ' ' && i + 1 < str.length() && Character.isLetter(str.charAt(i + 1))) {
                str.setCharAt(i + 1, Character.toUpperCase(str.charAt(i + 1)));
            }
        }
        return str;
    }
}


/*
You're absolutely right — in Java, non-static methods belong to instances (objects) of a class, not the class itself. So if you try to call a non-static method from a static context (like main), Java will require you to first create an object of that class.
 */