package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//합병정렬(Merge Sort)로 오름차순 수 정렬하기
//1. origin >> 최소 원소까지 divide
//2. sort - merge >> sorted
public class _2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 정렬할 개수
		int[] origin = new int[N]; // 원래 배열
		for (int i = 0; i < N; i++) {
			origin[i] = Integer.parseInt(br.readLine());
		}
		divide(origin, 0, origin.length);

		for (int i = 0; i < origin.length; i++) {
			System.out.println(origin[i]);
		}
	}

	public static void divide(int[] arr, int start, int end) {
		if ((end - start) == 1) {
			return;
		} else {
			int mid = (start + end) / 2;
			divide(arr, start, mid);
			divide(arr, mid, end);
			merge(arr, start, mid, end);
		}
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		int sorted[] = new int[end - start];

		int s = 0;
		int i = start;
		int j = mid;

		while (i < mid && j < end) {
			if (arr[i] < arr[j]) {
				sorted[s++] = arr[i++];
			} else {
				sorted[s++] = arr[j++];
			}
		}
		while (i < mid) {
			sorted[s++] = arr[i++];
		}
		while (j < end) {
			sorted[s++] = arr[j++];
		}
		s = 0;
		for (int m = start; m < end; m++) {
			arr[m] = sorted[s++];
		}

	}
}
