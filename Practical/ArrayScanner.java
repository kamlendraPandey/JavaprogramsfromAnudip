/*
 * @Author kamlendra pandey
 */
import java.util.Scanner;
public class ArrayScanner
{
public static void main(String args[])
{
int m;
Scanner sc=new Scanner(System.in);
System.out.println("How many elements you want to print.?");
m= sc.nextInt();

int arr[]= new int[m];
System.out.println("Enter the values");
                                        //Accepting the values from the keyboard and stores it in the array arr.
for(int i=0;i<m;i++)
{
arr[i] = sc.nextInt();
}
                                        //print the array
for(int a: arr)
{
System.out.println(a);
}
                                      //printing the Array in Reverse order
for(int i= arr.length-1; i>=0;i--)
{
System.out.println(arr[i]+" ");
}
}
}
