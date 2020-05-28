package 재귀;

import java.util.Scanner;

public class _10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(factorial(N));

	}

	static int factorial(int n2) {
		if(n2==0) {
			return 1;
		}else {
			return n2 * factorial(n2-1);
		}
	}
}
