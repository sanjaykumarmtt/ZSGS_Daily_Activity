package BiweeklyTest;

public class ShortestPalindromeSolver {

	public static void main(String[] args) {

		String s1 = "aacecaaa",
				s2 = "abcd",
				s3= "race";
		System.out.println(solve(s1));
		System.out.println(solve(s2));
		System.out.println(solve(s3));
	}
    public static String solve(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        String temp = s + "#" + new StringBuilder(s).reverse().toString();
        int[] lps = computeLPS(temp);
        int longestPalindromePrefixLength = lps[lps.length - 1];

        String suffixToAdd = s.substring(longestPalindromePrefixLength);
        String reversedSuffix = new StringBuilder(suffixToAdd).reverse().toString();

        return reversedSuffix + s;
    }

    private static int[] computeLPS(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int len = 0;
        int i = 1;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}