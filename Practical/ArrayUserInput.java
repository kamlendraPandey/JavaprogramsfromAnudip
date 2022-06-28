/*
 * @Author kamlendra pandey
 */
import java.util.Scanner;
public class ArrayUserInput
{
public static void main(String args[])
{
int m;
int Total_Marks=0 ;
float Percentage;
Scanner obj= new Scanner(System.in);
System.out.println("enter the number of subjects you have in exam.?");

m=obj.nextInt();

int arr[]=new int[m];
System.out.println("enter the marks you got in each subjects");

for(int i=0;i<m;i++)
{
arr[i]=obj.nextInt();
}
for(int i=0; i<m; i++)
{
Total_Marks = Total_Marks + arr[i];
}
System.out.println("Total marks the user got is:" +Total_Marks);

Percentage= (Total_Marks/(float)m);
System.out.println("Total Percentage :" + Percentage + "%");
}
}

