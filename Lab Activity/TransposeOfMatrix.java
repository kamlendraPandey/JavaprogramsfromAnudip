/*
 * @Author Kamlendra pandey
 */

public class TransposeOfMatrix {

	public static void main(String[] args) {
		// creating matrix
		int matrixA[][] = { { 11, 22, 33 }, { 21, 31, 41 }, { 31, 41, 51 } };
		// maatrix for the Transposed value
		int matrixB[][] = new int[3][3];

		// transpose matrix
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matrixB[i][j] = matrixA[j][i];
			}
		}
		System.out.println("Printing the matrix without Transpose :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrixA[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("Printing the Matrix after the Transpose :");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(matrixB[i][j] + "  ");
			}
			System.out.println();
		}

	}

}
