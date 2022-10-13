package coreJavaPRACTICE;

import java.util.Scanner;

class GoodMorning {
	
	public void getTheNumber(int num) {
		
		if(num <= 0) {
			System.out.println("!!please enter a number above 0");
		}
		else if (num >= 51) {
			System.out.println("!!please enter a number below 51");
		}
		else {
			for (int i = 1; i<= num; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println("Good Morning");
				}
				else if (i % 3 == 0 && i % 5!=0) {
					System.out.println("Good");
				}
				else if (i % 3 != 0 && i % 5 == 0) {
					System.out.println("Morning");
				}
				else {
					System.out.println(i);
				}
			}
		}
	}
}

public class CoreJavaBased {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number :");
		GoodMorning gm = new GoodMorning();
		gm.getTheNumber(sc.nextInt());
	
	}

}
