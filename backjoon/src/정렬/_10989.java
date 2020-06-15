package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//앞서 푼 방법이 시간초과로 제출이 안 되어서 다른 사람들의 블로그를 참고해 조금 더 효율적으로 만들었다.
//StringBuilder와 BufferedReader를 이용하자!
public class _10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		int count[] = new int[10001];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < N; i++) {
			count[arr[i]]++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			for (int j = 0; j < count[i]; j++) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);

	}

}
