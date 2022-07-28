import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		{
			String s, rev = "";
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String which you want to check : ");
			s = sc.nextLine();
			int length = s.length();
			for (int i = length - 1; i >= 0; i--)
				rev = rev + s.charAt(i);

			if (s.equals(rev))

				System.out.println("Entered String " + s + " is palindrome");

			else
				System.out.println("Entered String " + s + " is not palindrome");
			sc.close();

		}

	}
}