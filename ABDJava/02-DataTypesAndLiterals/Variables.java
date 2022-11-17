import java.lang.*;

class Variables
{
    public static void main(String args[])
    {
        // byte b=130; // will throw error as it is beyond the range.
        // byte b=128; // will throw error as it is beyond the range.
        byte b=127;

        short s=300;
        int i=100;
        // b=50;
        // System.out.println(b);
        float f=25.2f;
        char c='A';

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(f);
        System.out.println(c);

    }
}