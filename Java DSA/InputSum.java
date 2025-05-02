import java.util.Scanner;
public class InputSum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2 numbers seperated by space : ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print("Sum of " + number1 + " and " + number2 + " is " + (number1+number2));
    }
}