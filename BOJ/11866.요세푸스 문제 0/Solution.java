import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		int n = sc.nextInt();
		int k = sc.nextInt();

		for(int i = 1; i <= n; i++) {
			q.add(i);
		}

		System.out.print("<");

		while (q.size() > 1) {
			for(int i = 0;i < k-1; i++) {
				int polled = q.poll();
				q.offer(polled);
			}
			System.out.print(q.poll()+", ");
		}
		System.out.print(q.poll()+">");
	}

}
