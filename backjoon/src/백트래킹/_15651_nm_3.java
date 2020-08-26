package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _15651_nm_3 {

	private static StringBuilder sb = new StringBuilder();
	private static int N;
	private static int M;
	private static int[] arr;
	private static int[] arr2;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		arr = new int[N + 1]; // N개의 자연수 배열
		arr2 = new int[M]; // 출력 순서를 저장하는 배열
		for (int i = 1; i < N + 1; i++) {// 초기화
			arr[i] = i;
		}
		pick(0);
		System.out.println(sb);

	}

	public static void pick(int cnt) {
		if (cnt == M) { // 1. 종료 조건 : M개 달성시 출력
			
			for (int i = 0; i < cnt; i++) {
				sb.append(arr2[i] + " ");
			}
			sb.append("\n");
			return;
		}
		// 2. 그 외
		for (int i = 1; i < N + 1; i++) {
			arr2[cnt] = arr[i];
			pick(cnt + 1);
		}
	}
}
