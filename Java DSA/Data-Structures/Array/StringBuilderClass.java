import java.util.*;
public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Aksh");
        System.out.println(str.getClass().getName());
        System.out.println(((Object)str.toString()).getClass().getName());
    }
}

/*
You can use instanceof or getClass() for conditional checks, but Java doesn't support true reflection of local variable types at compile time, like dynamically typed languages do.
 
 ✅ Java is Statically Typed:
In Java, you must declare the data type of every variable when you write the code. The compiler checks types before the program runs, which helps catch errors early.

✅ "Every method like toString() comes from Object, and when you use it with a specific class, Java runs the version overridden in that class — if it exists."
*/