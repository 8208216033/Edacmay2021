//convert Decimal to Octol
import java.util.Scanner;
class Q21
{
public static void main(String args[])
{
int oct[]=new int[20];
int index=0;
int n=15;
while(n>0)
{
oct[index]=n%8;
n=n/8;
index++;
};
for(int i=index-1;i>=0;i--)
{
System.out.println(oct[i]);
}
}
}