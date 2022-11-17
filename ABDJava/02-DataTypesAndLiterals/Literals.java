import java.lang.*;
class Literals
{
    public static void main(String args[])
    {
        byte b=15;

        byte b1 = 10; //Decimal
        byte b2 = 0b1010; // Binary
        byte b3 = 012;
        byte b4 = 0XA;

        short s=15;
        int i=15;

        // Printing all numbers in 10
        System.out.println(b);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);

        System.out.println("Long");

        // long l =12511122111111; // Too large
        long l =12511122111111L;
        long l1 =12_511_122_111_111L; // Easy to read
        System.out.println(l);

        // int i1 =125L; // Incompatible types.
        // System.out.println(i1);

        // float f=12.56; // Incompatible types
        float f=12.56f; 
        // float f1=1211_.56f; // Not Allowed (Illegal)

        double d= 12.56d; 

        System.out.println(f);
        System.out.println(d);





    }
}