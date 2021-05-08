
//Addition of two binary numbers
import java.util.Scanner;

class Q17
{
public static void main(String args[])
{
long n1,n2;
int i=0,carry=0;
int sum[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("Enter n1");
n1=sc.nextLong();
System.out.println("Enter n2");
n2=sc.nextLong();
while(n1 !=0||n2!=0)
{
sum[i++]=(int)((n1%10+n2%10+carry)%2);
carry=(int)((n1%10+n2%10+carry)/2);
n1=n1/10;
n2=n2/10;
}
if (carry!=0)
{
sum[i++]=carry;
}
--i;
System.out.println("output:");

while(i>=0)
{
System.out.println(sum[i--]);
}

}
}