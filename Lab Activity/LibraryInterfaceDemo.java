/*
 * @Author Kamlendra Pandey
 */


import java.util.Scanner;

interface LibraryUser {
	void registerAccount();

	void requestBook();
}

class KidUsers implements LibraryUser {
	int age;
	String bookType;

	public void registerAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age");
		age = sc.nextInt();

		if (age < 12) {
			System.out.println("You have Succesfully registered under a kids Account");
		} else {
			System.out.println("Sorry,Age must be less than 12 to register as a kid");
		}
	}

	public void requestBook() {
		if (age < 12) {
			Scanner s1 = new Scanner(System.in);
			System.out.println("Books Available KID's Books & FICTION'S book");

			bookType = s1.nextLine();

			switch (bookType) {
			case "kids":
				System.out.println("Book Issued successfully,please return the book within 10 days ");
				break;
			case "fictions":
				System.out.println("Oops, you are allowed to take only kids books");
				break;
			default:
				System.out.println("enter valid book name!!!");
				break;

			}
		}

	}
}

class AdultUser implements LibraryUser {
	int age;
	String bookType;

	@Override
	public void registerAccount() {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter your Age");
		age = sc1.nextInt();
		if (age > 12) {
			System.out.println("You have Succesfully registered under an Adult Account");
		} else {
			System.out.println("Sorry,Age must be greater than 12 to register as an Adult");

		}
	}

	@Override
	public void requestBook() {
		if (age > 12) {
			Scanner s2 = new Scanner(System.in);
			System.out.println("Books Available KID's Books & FICTION'S book");

			bookType = s2.nextLine();
			switch (bookType) {
			case "kids":
				System.out.println("Oops, you are allowed to take only Adults books ");
				break;
			case "fictions":
				System.out.println(" Book Issued successfully,please return the book within 7 days");
				break;
			default:
				System.out.println("enter valid book name!!!");
				break;

			}
		}

	}
}

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		KidUsers k = new KidUsers();
		k.registerAccount();
		k.requestBook();

		AdultUser ad = new AdultUser();
		ad.registerAccount();
		ad.requestBook();

	}

}