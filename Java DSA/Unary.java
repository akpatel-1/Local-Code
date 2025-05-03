public class Unary{
    public static void main(String[] args){
        int a = 10;
        int b = ++a;//first change in memory then use it to create b.
        System.out.println("a: " + a + "\n" + "b: " + b);

        int c = 10;
        int d = c++;//first use it to create d then change in memory.
        System.out.println("c: " + c + "\n" + "d: " + d);
    }
}