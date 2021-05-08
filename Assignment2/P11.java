 
/*       A
        A B 
       A B C
      A B C D
     A B C D E
                */

class P11
{
public static void main(String args[])
{

for(int i=1;i<=5;i++)
{
for(int j=4;j>=i;j--)
{
System.out.print(" ");
}
int alpha=64;
for(int j=1;j<=i;j++)
{
System.out.print((char)(alpha+j) +" ");
}
System.out.println();
}
}
}