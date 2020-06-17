package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _11650 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().trim().split(" ");
			arr[i][0] = Integer.parseInt(s[0]);
			arr[i][1] = Integer.parseInt(s[1]);
		}
		myXYSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

	public static void myXYSort(int[][] arr) {
		int x = 0, y = 0;
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - j - 1; i++) {
				if (arr[i][0] > arr[i + 1][0]) {
					x = arr[i][0];
					y = arr[i][1];
					arr[i][0] = arr[i + 1][0];
					arr[i][1] = arr[i + 1][1];
					arr[i + 1][0] = x;
					arr[i + 1][1] = y;
				} else if (arr[i][0] == arr[i + 1][0]) {
					if (arr[i][1] > arr[i + 1][1]) {
						x = arr[i][0];
						y = arr[i][1];
						arr[i][0] = arr[i + 1][0];
						arr[i][1] = arr[i + 1][1];
						arr[i + 1][0] = x;
						arr[i + 1][1] = y;
					}
				}
			}
		}
	}
}
