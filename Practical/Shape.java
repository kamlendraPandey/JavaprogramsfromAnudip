/*
 * @kamlendra pandey
 */

package javaanudip;

class Circle {
	float radius;

	Circle() {
		radius = 1.5f;
	}
}

public class Shape {

	public static void main(String[] args) {
		Circle circle1 = new Circle();
		System.out.println("The Radius of the Circle is :" + circle1.radius);

	}

}
