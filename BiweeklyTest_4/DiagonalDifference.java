package BiweeklyTest_4;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arra = new ArrayList<>();

		ArrayList<Integer> temp = new ArrayList<>();
		temp.add(3);
		ArrayList<Integer> temp1 = new ArrayList<>();
		temp1.add(11);
		temp1.add(2);
		temp1.add(4);

		ArrayList<Integer> temp2 = new ArrayList<>();
		temp2.add(4);
		temp2.add(5);
		temp2.add(6);
		
		ArrayList<Integer> temp3 = new ArrayList<>();
		temp3.add(10);
		temp3.add(8);
		temp3.add(-12);
		


		arra.add(temp);
		arra.add(temp1);
		arra.add(temp2);
		arra.add(temp3);
		
		System.out.println("hekjk "+solve(arra));
	}

	public static int solve(ArrayList<ArrayList<Integer>> arr) {

		List<Integer> length = arr.get(0);

		int[][] mat = new int[length.get(0)][length.get(0)];
		int i = 0, j = 0;
		arr.remove(0);
		for (ArrayList<Integer> temp : arr) {

			for (int k = 0; k < temp.size(); k++) {
				mat[i][j] = temp.get(k);
				j++;
			}
			i++;
			j = 0;
		}
		int rightDiagonal = 0, leftDiagonal = 0;

		i = 0;
		j = 0;

		while (i < mat.length && j < mat[0].length) {
			rightDiagonal += mat[i][j];
			i++;
			j++;
		}

		i = 0;
		j = mat[0].length - 1;

		while (i < mat.length && j >= 0) {
			leftDiagonal += mat[i][j];
			i++;
			j--;
		}
		for (int c = 0; c < mat.length; c++) {

			for (int r = 0; r < mat.length; r++) {

				System.out.print(mat[c][r]+" ");

			}
			System.out.println();

		}

		System.out.print(rightDiagonal + " " + leftDiagonal);

		return Math.abs(rightDiagonal - leftDiagonal);

	}
}

//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
//at Solution.solve(Main.java:15)
//at Main.main(Main.java:111)

//Runtime Error
// Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3

//at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
//at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
//at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
//at java.base/java.util.Objects.checkIndex(Objects.java:361)
//at java.base/java.util.ArrayList.get(ArrayList.java:427)
//at Solution.solve(Main.java:6)
//at Main.main(Main.java:79)
