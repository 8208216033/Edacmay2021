//Area and perimeter of rectangle
import java.util.Scanner;
class Q13
{
public static void main(String args[])
{
Float Breadth,Length,Area,Perimeter;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Length");
Length=sc.nextFloat();
System.out.println("Enter Breadth");
Breadth=sc.nextFloat();
Area=Length*Breadth;
System.out.println("Area of Rectangle="+Area);
Perimeter=2*(Length+Breadth);
System.out.println("Perimeter of Rectangle="+Perimeter);


}
}