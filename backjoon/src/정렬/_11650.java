package 정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

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
		//comparator 익명함수 재정의로 시간초과 해결!
		Arrays.sort(arr, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) { //x좌표가 같을 경우 y좌표 비교 오름차순
					return Integer.compare(o1[1], o2[1]);
				}
				return Integer.compare(o1[0], o2[0]); //x좌표 오름차순
			}
		});

//		myXYSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][0] + " " + arr[i][1]);
		}
	}

	// 버블정렬,,,시간초과!
//	public static void myXYSort(int[][] arr) {
//		int x = 0, y = 0;
//		for (int j = 0; j < arr.length; j++) {
//			for (int i = 0; i < arr.length - j - 1; i++) {
//				if (arr[i][0] > arr[i + 1][0]) {
//					x = arr[i][0];
//					y = arr[i][1];
//					arr[i][0] = arr[i + 1][0];
//					arr[i][1] = arr[i + 1][1];
//					arr[i + 1][0] = x;
//					arr[i + 1][1] = y;
//				} else if (arr[i][0] == arr[i + 1][0]) {
//					if (arr[i][1] > arr[i + 1][1]) {
//						x = arr[i][0];
//						y = arr[i][1];
//						arr[i][0] = arr[i + 1][0];
//						arr[i][1] = arr[i + 1][1];
//						arr[i + 1][0] = x;
//						arr[i + 1][1] = y;
//					}
//				}
//			}
//		}
//	}
}
