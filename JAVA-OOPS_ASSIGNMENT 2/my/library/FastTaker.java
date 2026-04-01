package my.library;

public class FastTaker extends InputBox {
	
	final int a=10;

	public int getNymber() {
	
		return Integer.parseInt(setInput());
	}

	public int[] getNymber(int length) {
		int[] intArray = new int[length];
		for (int i = 0; i < length; i++) {
			intArray[i] = Integer.parseInt(setInput());
		}
		return intArray;
	}

	public float getFloat() {
		return Integer.parseInt(setInput());
	}

	public double getDouble() {
		return Integer.parseInt(setInput());
	}

	public boolean getBoolean() {
		return Boolean.parseBoolean(setInput());
	}

	public String getSingleWord() {
		String ignoreSpace =setInput();
		 int temp=ignoreSpace.indexOf(" ");
		return ignoreSpace.substring(0, temp);
	}

	public String getFulllineWord() {
		return setInput();
	}

	public String[] getWordArray(int length) {
		String[] StringArray = new String[length];
		for (int i = 0; i < length; i++) {
			StringArray[i] = setInput();
		}
		return StringArray;
	}

	public char getcharAt() {
		return setInput().charAt(0);
	}

	public char[] getcharAt(int length) {
		char[] charArray = new char[length];
		for (int i = 0; i < length; i++) {
			charArray[i] = setInput().charAt(i);
		}
		return charArray;
	}

}
