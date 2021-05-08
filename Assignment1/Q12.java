//Average of 3 numbers
import java.util.Scanner;
class Q12
{
public static void main(String args[])
{
int n1,n2,n3,Average;
Scanner sc=new Scanner(System.in);
System.out.println("Enter n1");
n1=sc.nextInt();
System.out.println("Enter n2");
n2=sc.nextInt();
System.out.println("Enter n3");
n3=sc.nextInt();
Average=(n1+n2+n3)/3;
System.out.println("Average="+Average);

}
}