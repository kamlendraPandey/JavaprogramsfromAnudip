class FibonacciSeries
{
public static void main(String args[])
{
int n1=0, n2=1, n3, i, count=10;
System.out.print(n1+" "+n2);   //printing 0 & 1 earlier

for(i=2;i<count; ++i)            //loop start from 2 because 0 & 1 are already printed
{
  n3=n1+n2;
System.out.print(" "+n3);
 n1=n2;
n2=n3;
    }
  }
}