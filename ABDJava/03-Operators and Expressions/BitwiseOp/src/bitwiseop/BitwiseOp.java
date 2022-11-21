package bitwiseop;


public class BitwiseOp 
{
    public static void main(String[] args) 
    {
        int x =10, y=6, z;
        int a=0b1010;
        int b=0b0110;
        int c;
        
        // Bitwise Anding
        z = x&y;
        c = a&b;
        System.out.println(z);
        
        // Bitwise OR        
        z=x|y;
        System.out.println(z);
        
        // BitwiseXOR
        z = x^y;
        System.out.println(z);
        
        System.out.println(c);
        
        
        // Bitwise Left Shift
        int d = 0b1000;
        int e;
        e = d<<1;
        System.out.println(e);
        
        
        // Bitwise Righ Shift
        e = d<<3;
        System.out.println(e);
        
        int f=0b1000;
        int g;
        g= f>>1;
        System.out.println(g);
        
        
        // Bitwise Sign Right Shift
        int h = -0b1010;
        int i,j ;
        i = h>>>1;
        j = h>>1;
        System.out.println(i);
        
        // Binary pattern of h value
        System.out.println(String.format("%s", Integer.toBinaryString(h)));
        System.out.println(String.format("%s", Integer.toBinaryString(i)));
        System.out.println(String.format("%s", Integer.toBinaryString(j)));
        
        
        // Bitwise Negation
        int n = 0b1010;
        int o;
        o = ~n;
        System.out.println(String.format("%s", Integer.toBinaryString(n)));
        
        // Inversed in bits
        System.out.println(String.format("%s", Integer.toBinaryString(o)));
        System.out.println(n);        
        System.out.println(o);


    }
    
}
