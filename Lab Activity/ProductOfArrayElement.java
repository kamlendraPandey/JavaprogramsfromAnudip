/*
*@Kamlendra pandey
*/
import java.util.Scanner;
public class ProductOfArrayElement {

	public static void main(String[] args) {
		int a[], num, prod = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		num = sc.nextInt();

		a = new int[num];
		System.out.println("Enter the elements of Array");
		for (int i = 0; i < num; i++) {
			{
				System.out.println("enter the " + (i + 1) + "elements:");
				a[i] = sc.nextInt();
				prod = prod * a[i];
			}
			System.out.println("the product of the array element is :" + prod);
		}
		sc.close();
	}

}