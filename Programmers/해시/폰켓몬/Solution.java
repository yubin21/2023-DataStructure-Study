import java.util.*;

class Solution {
	public int solution(int[] nums) {
		int ans = 0;
		int pickNum = nums.length / 2; // N/2 마리를 선택

		HashSet<Integer> set = new HashSet<>(); // hashset 생성: 중복 저장 불가능.
		for(int n : nums) {
			set.add(n);
		}

		if(pickNum >= set.size()) // 만약 고른 수가 set의 크기보다 크거나 같다면
			ans = set.size(); //set의 크기 출력
		else
			ans = pickNum;

		return ans;
	}
}