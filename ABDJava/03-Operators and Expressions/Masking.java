import java.lang.*;

class Masking
{
    public static void main(String args[])
    {
        byte a=9, b=12;
        byte c;

        // c = (byte)(9<<4);
        // c = (byte)(c<<12);
        c= (byte)(a<<4);
        // Returns integer type data
        c= (byte)(c|b);
        // see c value in first 4 bits
        System.out.println((c&0b11110000)>>4); // right side of c byte
        System.out.println((c&0b00001111)); // left side of c byte
    }
}