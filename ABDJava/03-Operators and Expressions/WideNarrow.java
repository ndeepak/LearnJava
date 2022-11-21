import java.lang.*;
public class WideNarrow { 
// Widening=Upcasting(implicitly)  and Narrowing=DownCasting(Explicitly)
    public static void main(String[] args) {
        byte b=5;
        short s=120;
        int i=10;
        long l=10;
        //float f=10;
        float f=10.5f;
        double d=10;
        char c=10;
        boolean bl=true;
        
        /*
        b=(byte)s; // Narrowing 
        b=s;// Thorws error
        System.out.println(b);
        // Allowed
        i=s;
        l=s;
        f=s;
        d=s;
        */
        
        i=(int)f; // Narrowing
        System.out.println(i);
    }
    
}