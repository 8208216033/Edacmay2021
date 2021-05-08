//swapping of two number
import java.util.Scanner;
class Q15
{
public static void main(String args[])
{
int n1,n2,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n1");
n1=sc.nextInt();
System.out.println("Enter n2");
n2=sc.nextInt();
temp=n1;
n1=n2;
n2=temp;
System.out.println(n1+"  ");
System.out.println(n2);


}
}