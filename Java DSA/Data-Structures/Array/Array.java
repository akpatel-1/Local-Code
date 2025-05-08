public class Array{
    public static void main(String[] args){
        int[] arr = new int[10];
        int[] numbers = {1, 2, 3, 4, 5};
        String[] fruits = {"apple", "mango", "Orange"};
    }
}

/*LEARNING
✅ What is a Reference?
In Java, a reference is like a label or handle that points to an object in memory, but you can't see or manipulate the actual address like you can with a pointer in C++.

Think of a reference as a pointer with restrictions:
It points to an object.
You can use it to access the object.
But you can't do pointer arithmetic, or get its actual address.
Variable 	arr
What it Holds 	Reference (e.g., 0xABC123)
Where it Points 	 Array object [42, 0, 0] on the heap
But you never see 0xABC123 — that’s JVM’s internal business. 
⚡ Bottom line:
A Java reference stores an address under the hood, but you can’t touch it, see it, or mess with it. 
You just use the reference to talk to the object.
*/