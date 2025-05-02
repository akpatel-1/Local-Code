public class TypePromotion{
    public static void main(String[] args){
        char a = 'a' , b = 'b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(a);
        System.out.println(b);
        System.out.print(a-b);
        // byte c = 4;
        // byte d = c * 5;
        // System.out.print(c); error because due to the expression it converts byte to int so we need to typecast it.
    }
}

/*
LEARNING
Type promotion in Java refers to the automatic conversion of smaller data types into larger ones when performing operations to prevent data loss.
When performing arithmetic operations between different data types, Java promotes smaller types to larger types automatically:

1. Java automatically promotes each byte, short or char operand to int when evaluating an expression.
2. If one operand is long, float or double the whole expression is promoted to long, float or double.
 */