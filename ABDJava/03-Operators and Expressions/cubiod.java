import java.lang.*;
import java.util.Scanner;

class cubiod
{
    public static void main(String args[])
    {
        float length, breadth, height, totalarea, volume;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the length, breadth and height of cuboid: ");

        length = sc.nextFloat();
        breadth = sc.nextFloat();
        height = sc.nextFloat();


        totalarea = 2*((length*breadth) + (length*height) + (breadth*height));

        volume = length*breadth*height;

        System.out.println("Area and Volume of cuboid are: " + totalarea + " and " + volume);

    }
}