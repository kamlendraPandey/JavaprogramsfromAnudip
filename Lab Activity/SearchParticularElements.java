/*
*@Kamlendra pandey
*/
import java.util.Scanner;

public class SearchParticularElement {

	public static void main(String[] args) {
		int[] a = { 4, 9, 5, 3, 7 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the particular number of elements you want to check");
		int n = sc.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (a[i] == n) {
				System.out.println("Element Found!");

			}

		}
		sc.close();
	}
}