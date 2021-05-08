//binary to hex conversion
import java.util.Scanner;
public class Q23
{
public static void main(String args[])
{
   int hex[]=new int[1000];
   int i=1,j=0;
   int rem,dec=0,binary;
   System.out.println("Enter binary no");
   Scanner sc=new Scanner(System.in);
   binary=sc.nextInt();
 while(binary>0)
{
   rem=binary%2;
   dec=dec+rem*i;
   i=i*2;
   binary=binary/10;
}
  i=0;
 while(dec!=0)
{
   hex[i]=dec%16;
   dec=dec/16;
   i++;
   
}
  
   System.out.println("Hexadecimai no");
   for(int k=i-1;k<=0;k--)
{
    if(hex[k]>9)
{
    System.out.println((char)(hex[k]+55));
}
else
{
System.out.println(hex[k]);
}
}
}
}