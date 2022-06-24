/*
* @Author kamlendra pandey
*/

public class CheckingPrimeNumber
{
public static void main(String args[])
{
int number=39;
int divisiblecount=0;
int n = 2;

while( n <= number/n)
{
    if(number% n==0)
     {
        divisiblecount++;
          break;
        }
n++;
 }
if (divisiblecount==0)
{
System.out.println(number+ "is a prime number");
}
  else
{
System.out.println( number+ "is not a prime number");
          }
       }
     }
 