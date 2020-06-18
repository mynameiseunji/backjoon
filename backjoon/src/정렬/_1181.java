package 정렬;

import java.io.*;
import java.util.*;

public class _1181 {
//단어 정렬
//1.길이가 짧은 것부터
//2.길이가 같으면 사전 순으로
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<String> str_list = new ArrayList<String>();
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			if(!str_list.contains(str)) {
				str_list.add(str);
			}
		}
		Comparator<String> myComp = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2);
				}
				return Integer.compare(o1.length(), o2.length());
			}
		};
		str_list.sort(myComp);
		for(String s : str_list) {
			System.out.println(s);
		}
	}

}
