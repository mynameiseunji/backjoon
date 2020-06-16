package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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
		System.out.println(Math.round(avg(list)));
		System.out.println(center(list));
		System.out.println(frequent(list));
		System.out.println(range(list));
	}
	
	//1. 산술평균 : N개의 수들의 합을 N으로 나눈 값
	private static double avg(List<Integer> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		double avg = (double) sum / list.size();
		return avg;
	}
	
	//2. 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
	private static int center(List<Integer> list) {
		return list.get((list.size() / 2));
	}
	
	//3. 최빈값 : N개의 수들 중 가장 많이 나타나는 값
	private static int frequent(List<Integer> list) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0;
		int index = 0;
		List<Integer> key = new ArrayList<Integer>();
		//key 값 : 수 , value 값 : 수의 count 갯수
		for (int i = 0; i < list.size(); i++) {
			if(map.containsKey(list.get(i))) {
				map.replace(list.get(i), map.get(list.get(i))+1);
			}else {
				map.put(list.get(i), 1);
			}
			//count가 가장 큰 수 찾기
			if(max<=map.get(list.get(i))) {
				max = map.get(list.get(i));
			}
		}
		for(Entry<Integer, Integer> m : map.entrySet()) {
			if(m.getValue()==max) {
				key.add(m.getKey());
			} //최빈수인 key만 리스트에 저장
		}
		//최빈수가 여러개일 경우를 대비하여 오름차순 정렬
		Collections.sort(key);
		if(key.size()>1) { //최빈수가 여러개일 경우 2번째로 작은 수 출력
			index = key.get(1);
		}else { //최빈수가 하나일 경우
			index = key.get(0);
		}
		return index;
	}
	
	//4. 범위 : N개의 수들 중 최댓값과 최솟값의 차이
	private static int range(List<Integer> list) {
		return list.get(list.size()-1)-list.get(0);
	}

}
