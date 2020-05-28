package 문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class _2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer stk = new StringTokenizer(str, " ");
		String A = stk.nextToken();
		String B = stk.nextToken();

		String newA = "", newB = "";

		for (int i = 2; i >= 0; i--) {
			newA += A.charAt(i);
			newB += B.charAt(i);
		}
		if(Integer.parseInt(newA)>Integer.parseInt(newB)) {
			System.out.println(newA);
		}else {
			System.out.println(newB);
		}

	}

}
