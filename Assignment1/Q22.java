//Convert Binary to Decimal
import java.util.Scanner;
class Q22
{
public static void main(String args[])
{
int binary[]=new int[20];
int index=0;
int n=15;
while(n>0)
{
binary[index]=n%2;
n=n/2;
index++;
};
for(int i=index-1;i>=0;i--)
{
System.out.println(binary[i]);
}
System.out.println();
}
}