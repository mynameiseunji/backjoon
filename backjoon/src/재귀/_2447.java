package 재귀;

import java.util.Scanner;

public class _2447 {

	private static String[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		arr = new String[N][N];
		star(N, arr);
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void star(int n, String arr[][]) {
		int l = (n / 3); // n=81 -> l=27, n=27 > l=9, n=9 > l=3
		

	}

}
//for (int i = 0; i < 3; i++) {
//	for (int j = 0; j < 3; j++) {
//		for (int x = l * i; x < l * (i + 1); x++) {
//			for (int y = l * j; y < l * (j + 1); y++) {
//				if(i==1&&j==1){
//					arr[x][y] = " ";
//				} else {
//					arr[x][y] = "*";
//					if(l!=1) { star(l, arr[][]); }							
//				}
//			}
//		}
//	}
//}
//if ((l * i) + (l / 3) <= x && (l * j) + (l / 3) <= y && x < (l * i) + 2 * (l / 3)
//&& y < (l * j) + 2 * (l / 3))
//
//for (int i = 1; i <= n; i++) {
//	for (int x = 1; x <= n; x++) {
//		for (int j = l * (m - 1); j < (l * m); j++) {
//			for (int k = l * (m - 1); k < (l * m); k++) {
//				if (i == 2 && x == 2) {
//					arr[j][k] = " ";
//				} else {
//					arr[j][k] = "*";
//					if (l != 1) {
//						star(l, x);
//					}
//				}
//			}
//		}
//	}
//}