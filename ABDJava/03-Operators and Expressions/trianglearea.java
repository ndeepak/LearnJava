import java.lang.*;
import java.util.Scanner;

class trianglearea
{
    public static void main(String args[])
    {
        float base, height, area;
        System.out.println("Enter Base and Height: ");

        Scanner sc = new Scanner(System.in);

        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base * height / 2;
        // area = base*height*0.5;
        // area = 1f/2f * base * height;

        System.out.println("Area of a Triangle is " + area);
        


    }
}