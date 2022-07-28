public class VowelsAndConsonentCount {

	public static void main(String[] args) {

		int VowelC = 0, ConsonentC = 0;

		String str = "Java is an Object Oriented Programming";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				VowelC++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ConsonentC++;
			}
		}
		System.out.println("Number Of Vowels: " + VowelC);
		System.out.println("Number Of Consonent: " + ConsonentC);

	}

}
