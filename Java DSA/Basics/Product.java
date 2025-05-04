import java.util.Scanner;
public class Product{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 2 numbers seperated by space : ");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        System.out.print("Product of " + number1 + " and " + number2 + " is " + (number1*number2));
    }
}