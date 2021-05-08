//binary to octol conversion
import java.util.Scanner;
public class Q24
{
public static void main(String args[])
{
   int oct[]=new int[100];
   int dec=0,n=0;
   int binary;
   System.out.println("Enter binary no");
   Scanner sc=new Scanner(System.in);
   binary=sc.nextInt();
 while(binary>0)
{
   int temp=binary%10;
   dec=temp*Math.pow(2,n);
   binary=binary/10;
   n++;
}
  int oct[]=new int[20];
  int i=0;

 while(dec>0)
{
   int r=dec%8;
   oct[i++]=r;
   decimal=decimal/8;
   
}
  
   System.out.println("octal no");
   for(int j=i-1;j>=0;j--)
{
   
System.out.println(oct[j]);
}
}
}
