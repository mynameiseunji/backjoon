package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램 작성
public class _2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 입력할 수의 개수
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) { // N개의 수를 입력받기
			arr[i] = Integer.parseInt(br.readLine());
		}
		// 삽입정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}

		// 버블정렬

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j - 1] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
