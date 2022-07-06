/*
 *@kamlendra pandey 
 */

package javaanudip;

import java.util.Scanner;

class Area {
	int length, breadth;
	float area;

	public void calculateTheAreaOfRectangle() {
		System.out.println("The length is: " + length);
		System.out.println("The breadth is: " + breadth);
		System.out.println("The area of rectangle is: " + area);

	}
}

public class calculateArea {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// setting the Attributes
		Area Rectangle = new Area();

		// getting users input
		System.out.println("Enter the length of Rectangle: ");
		Rectangle.length = sc.nextInt();
		System.out.println("Enter the bradth of the Rectangle: ");
		Rectangle.breadth = sc.nextInt();
		Rectangle.area = Rectangle.length * Rectangle.breadth;

		// printing the atrributes
		Rectangle.calculateTheAreaOfRectangle();

		sc.close();

	}

}
