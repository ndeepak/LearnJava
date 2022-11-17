import java.lang.*;
class CheckSizeRange
{
    public static void main(String arg[])
    {
        System.out.println("Int Min: " + Integer.MIN_VALUE);
        System.out.println("Int Max: " + Integer.MAX_VALUE);
        System.out.println("Int Bytes: " + Integer.BYTES);


        System.out.println("Short Min: " + Short.MIN_VALUE);
        System.out.println("Short Max: " + Short.MAX_VALUE);
        System.out.println("Short Bytes: " + Short.BYTES);

        System.out.println("Float Min: " + Float.MIN_VALUE);
        System.out.println("Float Max: " + Float.MAX_VALUE);
        System.out.println("Float Bytes: " + Float.BYTES);

        System.out.println("Character Min: " + Character.MIN_VALUE);
        System.out.println("Character Max: " + Character.MAX_VALUE);
        System.out.println("Character Bytes: " + Character.BYTES);
    }
}

// javap java.lang.Integer
// javap java.lang.Float
// javap java.lang.Character