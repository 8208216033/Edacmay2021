//Print multiplication table

import java.util.Scanner;
class Q7
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter n");
n=sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.println("Table="+n*i);

}
System.out.println();
}
}