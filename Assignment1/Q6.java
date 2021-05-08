//Addition,Substraction,Dividation,Multiplication of two numbers

import java.util.Scanner;
class Q6
{
public static void main(String args[])
{
int n1,n2,Multiplication,Addition,Substraction,Divide;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n1");
n1=sc.nextInt();
System.out.println("Enter n2");
n2=sc.nextInt();

Addition=n1+n2;
System.out.println("Addition="+Addition);

Substraction=n1-n2;
System.out.println("Substraction="+Substraction);

Divide=n1/n2;
System.out.println("Divide="+Divide);

Multiplication=n1*n2;
System.out.println("Multiplication="+Multiplication);


}
}