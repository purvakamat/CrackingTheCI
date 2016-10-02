package ArraysAndStrings;
import java.util.Scanner;

/**
 * Created by kamat on 9/27/2016.
 */
public class SetZeroes {

	private void setZeroes(int[][] matrix){
		int[] rows = new int[matrix.length];
		int[] col = new int[matrix[0].length];

		for(int i=0; i<matrix.length; i++){
			for(int j=0; j<matrix[0].length; j++){
				if(matrix[i][j] == 0){
					rows[i] = 1;
					col[j] = 1;
				}
			}
		}

		for(int i=0; i<matrix.length; i++)
			for(int j=0; j<matrix[0].length; j++)
				if(rows[i] == 1 || col[j] == 1){
					matrix[i][j] = 0;
				}
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		int[][] matrix = new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				matrix[i][j] = scan.nextInt();
			}
		}

		SetZeroes sz = new SetZeroes();
		sz.setZeroes(matrix);

		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(" " + matrix[i][j]);
			}
			System.out.print("\n");
		}
	}
}
