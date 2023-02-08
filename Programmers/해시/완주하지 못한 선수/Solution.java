import java.util.*;

class Solution {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>(); // hashmap 사용
		for (String p: participant)
			map.put(p, map.getOrDefault(p, 0) + 1); // 선수 이름이 key, 해당 인원수 value (이때, getOrDefault를 사용한 것은  동명이인의 예외를 처리하기 위함.)
		for (String p: completion) // 같은 방법으로 완주한 선수들을 -1로 제거.
			map.put(p, map.get(p) - 1);

		for (String k: map.keySet()) { // for each를 통해 이전의 hashmap을 탐색.
			if(map.get(k) != 0) { // value가 0이 아니라면
				answer = k; // 그 선수가 답
				break;
			}
		}
		return answer;
	}
}