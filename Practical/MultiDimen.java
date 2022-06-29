/*
 * @Author kamlendra pandey
 */
public class MultiDimen
{
public static void main(String args[])
{
int rows,cols;
rows=2;
cols=3;
int arr[] [] = new int[2] [3];
arr[0] [0] = 9;
arr[0] [1] = 7;
arr[0] [2] = 4;
arr[1] [0] = 2;
arr[1] [1] = 4;
arr[1] [2] = 5;

for(int i=0; i<rows; i++)
     {
      for(int j=0; j<cols; j++)
             {
              System.out.print(arr[i] [j]+ " ");
              }
System.out.println(" ");
      }
  }
}