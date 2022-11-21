import java.lang.*;

class IncreamentDecreament
{
    public static void main(String args[])
    {
        int x =5;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        x=10;
        ++x;
        System.out.println(x);
        x--;
        System.out.println(x);
        x=5;
        int y;
        y = x++;
        System.out.println(x);
        System.out.println(y);

        int z;
        x=5;y=4;
        z= 2* x++ + 3 * ++y; // x =5, y=5
        System.out.println(z);

        x=5;y=4;
        z= 2* x++ + 3 * ++x; // x =5, x=7
        System.out.println(z);


        float a=3.5f;
        a++;
        System.out.println(a);     

        char c='A';
        c++;
        System.out.println(c);

        byte b=5;
        b++;
        // b=b+1; // gives error as it is integer literal
        System.out.println(b);   
    }
}