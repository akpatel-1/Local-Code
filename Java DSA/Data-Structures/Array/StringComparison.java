public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Akash", s2 = "Akash";
        String s3 = new String("Akash");
        String s4 = new String("Akash");

        if (s1 == s2) {
            System.out.println("s1 == s2: Equal");
        } else {
            System.out.println("s1 == s2: Not Equal");
        }

        if (s2 == s3) {
            System.out.println("s2 == s3: Equal");
        } else {
            System.out.println("s2 == s3: Not Equal");
        }

        if (s3 == s4) {
            System.out.println("s3 == s4: Equal");
        } else {
            System.out.println("s3 == s4: Not Equal");
        }
    }
}

/* LEARNING
== checks reference equality (same object in memory)
🔹 .equals() checks value/content equality 

The String Constant Pool (or string intern pool) is a section of memory where Java stores unique string literals. If two string literals have the same value, Java will reuse the same object instead of creating a new one.
*/
