package ArraysAndStrings;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kamat on 9/26/2016.
 */
public class Anagrams {
	public boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length())
			return false;
    char[] word1 = s1.toCharArray();
    char[] word2 = s2.toCharArray();
    Arrays.sort(word1);
    Arrays.sort(word2);
		return (Arrays.equals(word1,word2));
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		System.out.println(new Anagrams().isAnagram(s1,s2));
	}
}
