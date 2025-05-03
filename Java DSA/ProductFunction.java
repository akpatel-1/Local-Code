public class ProductFunction {
    public static int getProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println(getProduct(12, 5));
    }
}

/* 🌟Learning
In Java, you can't call an instance method directly from a static context (like main) unless you create an object of the class.


 */