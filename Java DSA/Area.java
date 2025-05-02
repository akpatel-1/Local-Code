import java.util.Scanner;
public class Area{
    public static void main(String[] args){
        final float PI = 3.14159265359f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter radius of a circle : ");
        float radius = scan.nextFloat();
        System.out.print("Area of circle is " + ( PI * radius * radius));
        scan.close();
    }
}