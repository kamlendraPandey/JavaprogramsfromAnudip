/*
 * @Author kamlendra pandey
 */
import java.util.Scanner;
public class ArrayCopying
{
public static void main(String args[])
{
int[] arr1= {11,12,13,14,15};
int[] arr2= new int [arr1.length];

System.out.println("content of arr1[]");

for(int i=0; i<arr1.length; i++)
{
System.out.println(arr1[i]+ " ");
}

System.out.println("content of arr2[]");
for(int i = 0; i<arr1.length ; i++)
{
arr2[i]=arr1[i];
System.out.println(arr2[i]+ " ");
}
}
}

