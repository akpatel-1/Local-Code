public class Static {
    public static void main(String[] args) {
        // Calling static method without an object
        Static2.staticMethod();
        
        // Calling instance method requires creating an object
        Static2 object = new Static2();
        object.instanceMethod();
        object.staticMethod();
    }
}
