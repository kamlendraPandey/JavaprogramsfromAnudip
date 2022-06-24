/*
* @Author kamlendra pandey
*/
public class GreatestNumber
{
public static void main(String args[])
{
int n1=12, n2=23, n3=11, n4=9;
if (n1>n2)

               {   
                    if(n1>n3)
               {
                   if(n1>n4)
            {

System.out.println("the largest of four numbers is " + n1);
        }
else
{
System.out.println("the largest of four numbers is " + n4);
    }
 }
}

else if(n2>n3)

               {   
                    if(n2>n4)
            {

System.out.println("the largest of four numbers is " + n2);
        }
else
{
System.out.println("the largest of four numbers is " + n4);
     }
}
        else  if(n3>n4)
            {

System.out.println("the largest of four numbers is " + n3);
        }
else
{
System.out.println("the largest of four numbers is " + n4);
     }
  }
 }
