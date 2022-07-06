/*
 * @kamlendra pandey
 */

package javaanudip;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter number1: ");
		float number1 = obj.nextFloat();
		System.out.println("enter number2: ");
		float number2 = obj.nextFloat();
		System.out.println("enter number ranges from{1 to 4}");
		char numbers = obj.next().charAt(0);
		float result;

		switch (numbers) {
		case '1':
			result = number1 + number2;
			System.out.println("the Addition of entered number is :" + result);
			break;
		case '2':
			result = number1 - number2;
			System.out.println("the subtraction of entered number is :" + result);
			break;
		case '3':
			result = number1 * number2;
			System.out.println("the Multiplication of entered number is :" + result);
			break;
		case '4':
			System.out.println("QUIT");
			break;
		default:
			System.out.println("error! you have entered the wrong number");
			return;
		}
		obj.close();

	}

}
