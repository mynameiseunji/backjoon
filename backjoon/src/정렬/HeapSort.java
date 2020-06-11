package 정렬;

import java.util.Scanner;
//최소힙 정렬을 고정크기 배열로 만든다
//힙정렬은 unstable 정렬이다.(같은 값일 때 순서 보장x) 시간복잡도는 nlogn으로 합병정렬과 퀵정렬과 같다.
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

	// 1. 최소힙 삽입, 구성하기(insert)
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

	// 2. 최소 힙 반환, 루트노드 삭제연산(delete)
	public static void downheap(int[] arr, int l) {
		int[] new_arr = new int[arr.length];
		int i = 1;
		while (l > 0) { // 순서 거꾸로, 0번 루트노드가 삭제될때까지
			int index = arr.length - l;
			// 1. 0번 노드 삭제
			new_arr[index] = arr[0];
			// 2. 마지막 노드를 0번으로 올리고 삭제 된 노드는 out of limit 값으로 채우기
			arr[0] = arr[arr.length - i];
			arr[arr.length - i] = 9999999;
			int temp = 0;
			index = 0;
			// 3-1. 포인터를 바꾼 자리로! 안바뀌었으면 1번으로
			// 3-2. 포인터를 바꾼 자리로! 바뀌었으면 다시 자식노드와 검사
			// 3-3. 자식노드가 없을 경우 검사를 마치고 1번으로
			while (index < arr.length / 2) {
				if (arr[index * 2 + 1] > arr[index * 2 + 2]) { // 자식 비교 오른쪽이 더 작을경우
					if (arr[index * 2 + 2] < arr[index]) { // 부모랑 비교
						temp = arr[index];
						arr[index] = arr[index * 2 + 2];
						arr[index * 2 + 2] = temp;
						index = index * 2 + 2;
					}else { //부모가 더 작아서 자리를 바꿀 필요가 없을 경우 더 이상의 검사는 무의미
						index = arr.length/2+1;
					}
				} else { //왼쪽 자식노드가 오른쪽보다 더 작을 경우
					if (arr[index * 2 + 1] < arr[index]) { //왼쪽과 부모의 비교
						temp = arr[index];
						arr[index] = arr[index * 2 + 1];
						arr[index * 2 + 1] = temp;
						index = index * 2 + 1;
					}else { //자리를 바꿀 필요가 없으면 더 이상의 검사가 무의미하므로 while을 빠져나온다
						index = arr.length/2+1;
					}
				}
			}
			// 다음 정렬 순서로 이동
			i++;
			l--;
			
		}
		//새로운 arr를 return 할 수도 있지만, 원래 arr에 값을 복사해 덮어씌워준다.
		for (int j = 0; j < arr.length; j++) {
			arr[j] = new_arr[j];
		}
	}
}