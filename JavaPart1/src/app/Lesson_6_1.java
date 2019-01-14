package app;

import java.util.Arrays;
import java.util.Random;

public class Lesson_6_1 {
	public static void main(String[] args) {
		int n = 3;
		int m = 5;
		int a [][] = new int [3][5];
		Random name = new Random();			
		for (int i = 0; i<n; i++) {
			for (int j = 0; j<m; j++) {
				a[i][j] = name.nextInt(9);
				System.out.print(a[i][j] +" ");
			}
			System.out.println(" ");
		}
		for (int i = 0; i<n; i++) {
			Arrays.sort(a[i]);
		}
		for (int i = 0 ; i<n ; i++) {
			for (int j = 0 ; j<m ; j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println(" ");
		}
	
	}
}
