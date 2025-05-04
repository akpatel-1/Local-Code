public class Instance {
    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        staticMethod(); // Calling static method inside an instance method
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        Instance obj = new Instance();

        obj.instanceMethod();  // Calling instance method
    }
}
