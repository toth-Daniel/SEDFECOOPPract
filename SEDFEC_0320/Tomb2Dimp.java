package SEDFEC.src.hu.me.sedfec;

public class Tomb2Dimp {
	public static void main(String[] args) {

		int[][] matrix = { {2, 4, 5, -6}, {3, 5, 0, 7}, };

		System.out.println("A mátrix tartalma: ");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}
