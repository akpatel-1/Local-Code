public class TypeConversion{
    public static void main(String[] main){
        // 🔹 Implicit Conversion (Widening)
        int num = 100;
        double num2 = num;
        System.out.println("Implicit Conversion:");
        System.out.println("Integer: " + num);
        System.out.println("Converted to " + ((Object) num2).getClass().getSimpleName() + " " + num2); 
        
        System.out.println("----------------------");

        // 🔹 Explicit Conversion (Narrowing)
        double decimalNum = 99.99;
        int intNum = (int) decimalNum;
        System.out.println("Explicit Conversion:");
        System.out.println("Original Double: " + decimalNum);
        System.out.println("Converted to " + ((Object) intNum).getClass().getSimpleName() + " " + intNum);
    }
}

/*
LEARNING
Type conversion in Java refers to changing a value from one data type to another. Java supports two types of type conversion:

1. Implicit Type Conversion (Widening)
Happens automatically when converting a smaller data type to a larger one.
No data loss occurs.
✔ Allowed: byte → short → int → long → float → double ❌ Not Allowed: Converting from a larger type to a smaller one (may cause data loss).

2. Explicit Type Conversion (Narrowing / Type Casting)
Done manually using type casting.
Required when converting a larger type to a smaller one.
✔ Required for: double → float → long → int → short → byte

🌟 In Java, you can print the datatype of a variable using the .getClass().getSimpleName() method for objects, but for primitive types, you need wrapper classes.
int num = 10;
System.out.println(((Object) num).getClass().getSimpleName());

When a primitive type is converted into an object, Java uses its corresponding wrapper class from java.lang package. This process is called boxing (or autoboxing when done automatically).
Each primitive type has a corresponding wrapper class:

Primitive Type	Wrapper Class
byte	Byte
short	Short
int	    Integer
long	Long
float	Float
double	Double
char	Character
boolean	Boolean
 */