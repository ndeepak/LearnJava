// Data Types and Their Details
import java.lang.*;
import javax.swing.*;
import java.awt.*;

class DataType
{
    public static void main(String args[])
    {
        int x = 5;

        // javap java.lang.Integer --> toHex, toOctal, toBinary
        System.out.println(Integer.toBinaryString(x));
        int x1 = -5;
        System.out.println(Integer.toBinaryString(x1));

    }
}