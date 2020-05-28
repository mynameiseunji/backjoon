package 문자열;

import java.util.Scanner;

public class _11809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		char[] alpha = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		int arr[] = new int[alpha.length];
		for (int i = 0; i < alpha.length; i++) {
			arr[i] = -1;
		}
		for (int j = 0; j < S.length(); j++) {
			for (int k = 0; k < alpha.length; k++) {
				if(S.charAt(j)==alpha[k]) {
					if(arr[k]<=-1) {
						arr[k] = j;
					}
				}
			}
		}
		for(Integer i : arr) {
			System.out.print(i +" ");
		}
	}

}
