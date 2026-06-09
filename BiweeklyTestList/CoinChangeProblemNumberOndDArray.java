package BiweeklyTestList;

public class CoinChangeProblemNumberOndDArray {

	public static void main(String[] args) {

		int coin[] = { 1, 2, 5, 10 }, amount = 10;
		System.out.println(numberOfWaysToGetTotal(coin, amount));
	}

	static private int numberOfWaysToGetTotal(int[] coin, int amount) {

		int[] giveMone = new int[amount + 1];
		giveMone[0] = 1;
		for (int coins : coin) {
			for (int i = coins; i < giveMone.length; i++) {
				giveMone[i] = giveMone[i] + giveMone[i - coins];
			}
		}
		return giveMone[amount];
	}

}