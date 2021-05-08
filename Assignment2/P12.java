 
/*       A
        B B 
       C C C
      D D C D
     E E E E E
                */

class P12
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
System.out.print((char)(alpha+i) +" ");
}
System.out.println();
}
}
}