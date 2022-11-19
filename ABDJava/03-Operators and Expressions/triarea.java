import java.lang.*;
import java.util.Scanner;

class triarea
{
    public static void main(String args[])
    {
        int a, b, c;
        float s;
        double area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 sides of Triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        s = (a+b+c)/2f;

        area = Math.sqrt(s*(s-a) * (s-b) * (s-c));

        System.out.println("Area is " + area);
    }
}