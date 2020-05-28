package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//분해합
public class _2231 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 생성자를 가진 자연수 N 입력
		// 가장 작은 조합을 가지는 생성자 M찾기
		int M = 0;
		for (int i = 1; i < N; i++) {
			int sum = 0;
			int m = i;
			while(m>=1) {
				sum += (m % 10);
				m = m / 10;
			}
			if ((sum + i) == N) {
				M = i;
				break;
			}
		}
		System.out.println(M);
	}

}
