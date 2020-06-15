package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 그 다음 N개의 줄에는 정수들이 주어진다.
입력되는 정수의 절댓값은 4,000을 넘지 않는다.
1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이*/
public class _2108 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < N; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list);
		avg(list);

	}
	
	//1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
	private static double avg(List<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		double avg = (double) sum / list.size();
		return Math.round(avg);
	}
	
	//2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
	private static int center(List<Integer> list) {
		return list.get((list.size() / 2));
	}
	
	//3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
	private static int frequent(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < list.size(); i++) {
			if(map.containsKey(list.get(i))) {
				map.replace(list.get(i), map.get(list.get(i))+1);
			}else {
				map.put(list.get(i), 1);
			}
		}
		int max = 0;
		int index = 0;
		for(Integer i : map.keySet()) {
			if(max<map.get(i)) {
				max = map.get(i);
				index = i;
			}
		}            

		return index;
	}
	
	//4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이
	private static int range(List<Integer> list) {
		return 0;
	}

}
