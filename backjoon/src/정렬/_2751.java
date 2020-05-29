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
		int origin[] = new int[N]; // 원래 배열
		for (int i = 0; i < N; i++) {
			origin[i] = Integer.parseInt(br.readLine());
		}
		divide(origin, 0, N);

		int sorted[] = new int[N]; // 정렬된 후 배열
	}

	public static void divide(int arr[], int start, int end) {
		int l = arr.length / 2;
		int a1[] = new int[l];
		int a2[] = new int[end - (start+l)];
		if(arr.length == 1) {
			
		}
		else {
			for (int i = 0; i < l; i++) {
				a1[i] = arr[start + i];
			}
			for (int i = l; i < end; i++) {
				a2[i - l] = arr[start + l + i];
			}
		}
		divide(a1, start, l);
		divide(a2, l, end);
		merge(a1, a2);
	}

	public static void merge(int arr1[], int arr2[]) {
		int merge[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < merge.length; i++) {
//			while() {
//				
//			}
		}
	}
}
