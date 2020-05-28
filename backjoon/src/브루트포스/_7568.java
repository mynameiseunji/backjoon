package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _7568 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());// 전체사람수
		int chunk[][] = new int[N][2];
		int rank[] = new int[N];
		for (int i = 0; i < N; i++) {
			rank[i] = 1;
			String[] str = br.readLine().split(" ");
			chunk[i][0] = Integer.parseInt(str[0]);
			chunk[i][1] = Integer.parseInt(str[1]);
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (chunk[i][0] < chunk[j][0] && chunk[i][1] < chunk[j][1]) {
					rank[i] += 1;
				}
			}
		}
		for (int i = 0; i < N; i++) {
			System.out.print(rank[i] + " ");
		}
	}
}
