import java.util.*;

class Solution {
	public int solution(int[] nums) {
		int ans = 0;
		int pickNum = nums.length / 2;

		HashSet<Integer> set = new HashSet<>();
		for(int n : nums) {
			set.add(n);
		}

		if(pickNum >= set.size()) ans = set.size();
		else ans = pickNum;

		return ans;
	}
}