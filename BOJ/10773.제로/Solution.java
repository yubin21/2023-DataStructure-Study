import java.util.*;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<Integer>();
		
		int K = sc.nextInt();
		
		for(int i = 0; i < K; i++) {
			int num = sc.nextInt();
            	
			if(num == 0)
				stack.pop();
			else
				stack.push(num);
		}
		int sum = 0;
		
		for(int o : stack) {
			sum += o;
		}
 
		System.out.println(sum);	
	}
}