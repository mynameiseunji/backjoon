package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _2798 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(stk.nextToken());// 카드개수
		int M = Integer.parseInt(stk.nextToken());// 합 조건
		int arr[] = new int[N];
		int sum = 0;
		int max = 0;
		
		StringTokenizer stk2 = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(stk2.nextToken());
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				for (int k = j + 1; k < arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (sum <= M) {
						if (max < sum) {
							max = sum;
						}
					}
					sum = 0;
				}
			}
		}
		System.out.println(max);
	}

}
