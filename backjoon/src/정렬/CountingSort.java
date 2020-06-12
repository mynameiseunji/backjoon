package 정렬;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 10989번 문제 : 계수 정렬 이용
// 정렬할 수의 범위가 작을 때 유용!
public class CountingSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 입력할 수의 개수
		int arr[] = new int[N];
		int max = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] >= max) {
				max = arr[i];
			}
		}
		arr = Count(arr, max);

		for (int i = 0; i < N; i++) {
			System.out.println(arr[i]);
		}
	}

	private static int[] Count(int[] arr, int n) {
		int count[] = new int[n]; // count 후 index 배열
		int sorted[] = new int[arr.length]; // return할 배열

		// 계수를 저장하는 배열에 값 할당(배열 원소의 개수 count)
		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - 1]++;
		}
		// index 배열 생성(큰 수로 갈수록 count 누적하여 다시 index 값 저장)
		for (int i = 0; i < count.length - 1; i++) {
			count[i + 1] = count[i + 1] + count[i];
		}

		// arr배열 뒤에서부터 탐색 후(stable sort 성질 만족을 위해) sorted배열 알맞은 위치에 삽입하기
		for (int i = arr.length - 1; i >= 0; i--) {
			sorted[count[arr[i] - 1] - 1] = arr[i];
			count[arr[i] - 1]--;
		}
		return sorted;
	}

}
