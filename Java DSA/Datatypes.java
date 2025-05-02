// Java is a types language because you need to specify the type before declaring a variable. (Typed language)
public class Datatypes {
    public static void main(String[] args) {
        byte b = 8;
        short sh = 99;
        char ch = 'a';
        boolean var = true;
        float price = 5.55f;  // 'f' suffix is required for float 
        int num = 25;
        long lng = 123123123123L;
        double dbl = 888888.8888888888;

        System.out.println("byte: " + Byte.BYTES + " bytes");
        System.out.println("short: " + Short.BYTES + " bytes");
        System.out.println("char: " + Character.BYTES + " bytes");
        System.out.println("boolean: No fixed size (depends on JVM)");
        System.out.println("int: " + Integer.BYTES + " bytes");
        System.out.println("float: " + Float.BYTES + " bytes");
        System.out.println("long: " + Long.BYTES + " bytes");
        System.out.println("double: " + Double.BYTES + " bytes");
    }
}
