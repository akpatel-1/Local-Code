public class Variable{
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        final int c = 50;
        String name = "Akash patel";
        System.out.print(a + "\n" + b + "\n" + name + "\n");
        a = 60;
        b = 50;
        //c = 55 Compile-time error
        name = "patel";
        System.out.print(a + "\n" + b + "\n" + name + "\n");
    }
}