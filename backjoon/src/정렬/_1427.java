package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1427 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N.length(); i++) {
			list.add(Integer.parseInt(N.substring(i, i + 1)));
		}
		Collections.sort(list);
		Collections.reverse(list);
		for (int i : list) {
			System.out.print(i);
		}
	}
}
