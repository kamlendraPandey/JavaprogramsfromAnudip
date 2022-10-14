package coreJavaPRACTICE;

import java.util.Scanner;

public class StringBasedLab {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  //System.in is a standard input stream
		System.out.println("Enter a String a : ");
		String str = sc.nextLine();    //reads string 
		
		System.out.println("Enter a String b : ");
		String str1 = sc.nextLine();
		System.out.println("you have entered string a as: " +str);  //printing inputed string
		System.out.println("you have entered string b as: " +str1);
		
		//printing the length of String a and b
		System.out.println("Length of String a & b is : " +str.length()+ " & " +str1.length());
		
		//printing result of comparison of two string Lexicographically
		System.out.println(str.compareTo(str1));
		
		//capitalize the first letter
		String str2 = str.substring(0, 1).toUpperCase()+str.substring(1);
		String str3 = str1.substring(0, 1).toUpperCase()+str1.substring(1);
		         //printing the String
				System.out.println(str2+ " " + " " +str3);
      }
}
