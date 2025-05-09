import java.util.*;
public class Route {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.next();
        System.out.println("Shorted route: " + getShortRoute(str));
    }
    public static double getShortRoute(String str) {
    int x = 0, y = 0;
    for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        if (ch == 'E') ++x;
        else if (ch == 'W') --x;
        else if (ch == 'N') ++y;
        else if (ch == 'S') --y;
        else return -1;
    }
    return Math.sqrt((x * x) + (y * y));
}

}

// In Java, the method signature for Math.sqrt() is:
// public static double sqrt(double a)
// That means no matter what you pass in, Math.sqrt() returns a double.
