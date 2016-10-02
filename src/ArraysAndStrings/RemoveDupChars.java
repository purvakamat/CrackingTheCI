package ArraysAndStrings;
import java.util.Scanner;

/**
 * Created by kamat on 9/26/2016.
 */
public class RemoveDupChars {
  public char[] removeDups(char[] str){
    if (str == null) return str;
		int len = str.length;
		if(len < 2) return str;

		boolean[] hit = new boolean[256];
		int tail = 1;
		hit[str[0]] = true;

		for (int i = 1; i<len; i++){
			int c = str[i];
			if(!hit[c]){
				hit[c] = true;
				str[tail++] = str[i];
			}
		}

		if (tail < len)
			while(tail < len)
				str[tail++] = 0;
		return str;
  }
  
  public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	  String str = scan.next();
		char[] arr = str.toCharArray();
	  System.out.println((new RemoveDupChars()).removeDups(arr));
  }
  
}
