/*
 * @Author kamlendra pandey
 */
import java.util.Scanner;
public class MultiDimenWithScanClass
{
public static void main(String args[])
{
int rows,cols;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows you want to print");
      //Taking users input for rows and columns
rows = sc.nextInt();
System.out.println("Enter the number of cols you want to print");
cols = sc.nextInt();
int arr[] [] = new int[rows] [cols];
    
  //Taking user input for the array
for(int i=0; i<rows; i++)
 {
      for(int j=0; j<cols; j++)
      {
       System.out.println("Now Enter the values of Array");
         arr[i] [j] = sc.nextInt();
        }
System.out.println();	
  }
    //printing the Matrix
for(int i=0; i<rows; i++)
 {
      for(int j=0; j<cols; j++)
      {
         System.out.print(arr [i] [j]+ " " );
        }
 System.out.println(" ");
       }
    }
 }


