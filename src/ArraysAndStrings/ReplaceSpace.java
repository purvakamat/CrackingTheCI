package ArraysAndStrings;
import java.util.Scanner;
/**
 * Created by kamat on 9/26/2016.
 */
public class ReplaceSpace {
	private String replaceSpace(String s) {
		return s.replaceAll("[\\s]","%20");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		System.out.println(new ReplaceSpace().replaceSpace(s));
	}
}
