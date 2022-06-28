/*
 * @Author kamlendra pandey
 */
public class AddingArrays
{
public static void main(String args[])
{
int[] a= {1,2,3,4,5};
int[] b= {9,8,7,6,5};
int[] c= new int[a.length];

System.out.println("the content of Array a is: ");
for(int i=0; i<a.length; i++)
{
System.out.println(a[i]+ " " );
}
System.out.println("the content of Array b is: ");
for(int i=0; i<a.length; i++)
{
System.out.println(b[i]+ " ");
}
System.out.println("the content of Array c is: ");
for(int i=0; i<a.length; i++)
{
c[i] = a[i]+b[i];
System.out.println(c[i]+ " "); 
}
}
}