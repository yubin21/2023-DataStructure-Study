import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
		Stack<Integer> stack = new Stack<>(); // stack 생성

		for(int i = 0; i < arr.length; i++) { // 배열의 길이만큼 for 문
			if(stack.size() == 0 || arr[i] != stack.peek()) // 만약 스택의 크기가 0이 이거나(peek 사용시 예외가 발생해서 추가), arr[i]의 값이 스택의 값과 같지 않다면(= 같은 값이 없다면)
				stack.push(arr[i]); // 값 추가
		}

		int[] answer = new int[stack.size()]; // 정답을 위한 배열을 스택의 크기로 생성

		for(int j = stack.size() - 1; j >= 0; j--) { 
			answer[j] = stack.pop();
		}

		return answer;
	}
}