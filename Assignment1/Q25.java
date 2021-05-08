//octol to decimal conversion
import java.util.Scanner;
import java.lang.Math;

public class Q25
{  

public static void main(String args[])
{
 int octal, decimalNumber = 0, i = 0;
System.out.println("Enter octal number");
Scanner sc= new Scanner(System.in);
 octal = sc.nextInt();

while(octal != 0)
{
   decimalNumber += (octal % 10) * Math.pow(8, i);
   ++i;
   octal/=10;
}

System.out.println("Decimal Number is :"+decimalNumber);
}

}
