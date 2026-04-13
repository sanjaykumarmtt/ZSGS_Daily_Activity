package BiweeklyTest_6;

import java.util.ArrayList;
import java.util.List;

public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//width = [2, 3, 1, 2, 3, 2, 3, 3]
	// cases = [[0, 3], [4, 6], [6, 7], [3, 5], [0, 7]]

	}

	public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {

		List<Integer> res = new ArrayList<>();

		for (List<Integer> currentCase : cases) {
			int start = currentCase.get(0);
			int end = currentCase.get(1);

			int minWidth = Integer.MAX_VALUE;

			for (int i = start; i <= end; i++) {
				if (width.get(i) < minWidth) {
					minWidth = width.get(i);
				}
			}
			res.add(minWidth);
		}

		return res;
	}

}
