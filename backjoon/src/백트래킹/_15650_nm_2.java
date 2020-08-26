package 백트래킹;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class _15650_nm_2 {

	private static int N;
	private static int M;
	private static int[] arr;
	private static int[] arr2;
	private static int[] visited;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		arr = new int[N + 1]; //N개의 자연수 배열
		arr2 = new int[M]; //출력 순서를 저장하는 배열
		for(int i=1;i<N+1;i++) {//초기화
			arr[i]=i;
		} 
		visited = new int[N + 1]; //방문 표시 배열
		pick(0);
		
	}

	public static void pick(int cnt) {
		if (cnt == M) { // 1. 종료 조건 : M개 달성시 출력
			for (int i = 0; i < cnt; i++) {
				System.out.print(arr2[i]+" ");
			}
			System.out.println();
			return;
		}
		// 2. 그 외
		for (int i = 1; i < N + 1; i++) {
			if(cnt==0) { //재귀 첫 단계에서 방문 표시
				visited[i-1]=1;
			}
			if (visited[i] == 0) {
				visited[i]=1;
				arr2[cnt] = arr[i];
				pick(cnt+1);
				visited[i]=0;
			}
		}
	}

}
