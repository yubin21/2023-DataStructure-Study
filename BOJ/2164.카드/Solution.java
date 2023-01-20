import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i;
		Queue<Integer> q = new LinkedList<>();

		for (i = 1; i <= n; i++) {
			q.add(i);
		}

		while(q.size() > 1) {
			q.poll();
			q.offer(q.poll());
		}

		System.out.println(q.poll());
	}

}
