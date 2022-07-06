/*
*@kamlendra pandey
*/
import java.util.Scanner;
public class ArrEvenOdd
{
public static void main(String args[])
{
//Taking input from user
Scanner sc = new Scanner(System.in);
int n ;
//Declare size of an array 
System.out.println("Enter the size of the array: ");
n = sc.nextInt();
//initialize the array size
int arr[] = new int[n];
//declare an array
System.out.println("Enter the array elements: ");
for(int i = 0; i<n; i++)
{
arr[i]=sc.nextInt();
//initialize the array elements
}
//print the even elements
System.out.println("The Even Elements are...");
for(int i=0; i<n; i++)
{
if(arr[i]%2 == 0)
//Check whethereven or not
{
System.out.print(arr[i]+" ");
}
}
System.out.println(" ");
//print the odd elements
System.out.println(" The odd elements are:...");
for(int i = 0; i<n; i++)
{
if(arr[i]%2!=0)
//check whether odd or not
{
System.out.print(arr[i]+" ");
}
}
}
}

