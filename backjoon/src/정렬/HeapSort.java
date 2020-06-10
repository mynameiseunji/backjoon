package 정렬;

import java.util.Scanner;

public class HeapSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			upheap(arr, i);
		}
		downheap(arr, arr.length);
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	// 최소힙 만들기(insert)
	public static void upheap(int[] arr, int index) {
		int i = index;
		while (i > 0) {
			int l = i % 2;
			int temp = 0;
			if (l == 0) {
				if (arr[i / 2 - 1] > arr[i]) {
					temp = arr[i / 2 - 1];
					arr[i / 2 - 1] = arr[i];
					arr[i] = temp;
				}
				i = i / 2 - 1;
			} else {
				if (arr[i / 2] > arr[i]) {
					temp = arr[i];
					arr[i] = arr[i / 2];
					arr[i / 2] = temp;
				}
				i = i / 2;
			}
		}
	}

	// 루트노드 삭제연산(delete)
	public static void downheap(int[] arr, int l) {
		int[] new_arr = new int[arr.length];
		int i = 1;
		while (l > 0) { // 순서 거꾸로, 0번 루트노드가 삭제될때까지
			int index = arr.length - l;
			// 1. 0번 노드 삭제
			new_arr[index] = arr[0];
			// 2. 마지막 노드를 0번으로 올리고 자식노드 중 작은 수와 자신 비교해서 바꾸기
			arr[0] = arr[arr.length - i];
			arr[arr.length - i] = -1; // 삭제 된 노드 표시
			int temp = 0;
			index = 0;
			while ((arr[index] != -1) && index < arr.length / 2) {
				if (arr[index * 2 + 1] > arr[index * 2 + 2]) { // 자식 비교 오른쪽이 더 작을경우
					if (arr[index * 2 + 2] < arr[index]) { // 부모랑 비교
						temp = arr[index];
						arr[index] = arr[index * 2 + 2];
						arr[index * 2 + 2] = temp;
						index = index * 2 + 2;
					} else {
						index = arr.length + 1;
					}
				} else {
					if (arr[index * 2 + 1] < arr[index]) {
						temp = arr[index];
						arr[index] = arr[index * 2 + 1];
						arr[index * 2 + 1] = temp;
						index = index * 2 + 1;
					} else {
						index = arr.length + 1;
					}
				}
			}
			i++;
			l--;
			// 3. 포인터를 바꾼 자리로! 안바뀌었으면 1번으로
			// 4. 포인터를 바꾼 자리로! 바뀌었으면 다시 자식노드와 검사
			// 5. 자식노드가 없을 경우 검사를 마치고 1번으로

		}
		for (int j = 0; j < arr.length; j++) {
			arr[j] = new_arr[j];
		}
	}

}
