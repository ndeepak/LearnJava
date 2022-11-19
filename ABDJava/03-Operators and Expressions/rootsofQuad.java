import java.lang.*;
import java.util.Scanner;

class rootsofQuad
{
    public static void main(String args[])
    {
        int a, b, c;
        double r1, r2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 sides of: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println("Root1 is " + r1);
        System.out.println("Root2 is " + r2);

        
//         PS E:\01 Learn Java\LearnJava\ABDJava\03-Operators and Expressions> javac .\rootsofQuad.java  
// PS E:\01 Learn Java\LearnJava\ABDJava\03-Operators and Expressions> java rootsofQuad
// Enter 3 sides of:
// 1 1 1
// Root1 is NaN
// Root2 is NaN
// PS E:\01 Learn Java\LearnJava\ABDJava\03-Operators and Expressions> java rootsofQuad
// Enter 3 sides of:
// 1 -4 4
// Root1 is 2.0
// Root2 is 2.0
// PS E:\01 Learn Java\LearnJava\ABDJava\03-Operators and Expressions> java rootsofQuad
// Enter 3 sides of: 
// 1 5 6
// Root1 is -2.0
// Root2 is -3.0
// PS E:\01 Learn Java\LearnJava\ABDJava\03-Operators and Expressions> 
    }
}