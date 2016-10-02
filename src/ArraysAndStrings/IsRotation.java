package ArraysAndStrings;
import java.util.Scanner;

/**
 * Created by kamat on 9/27/2016.
 */
public class IsRotation {
	private boolean isRotation(String s1, String s2) {
		String s = s2 + s2;
		return s.contains(s1);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		System.out.println(new IsRotation().isRotation(s1,s2));
	}
}
