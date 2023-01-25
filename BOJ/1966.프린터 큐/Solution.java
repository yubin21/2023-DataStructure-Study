import java.util.*;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		int n, m, cnt;

		for(int i=0; i<t; i++) {
			LinkedList<int[]> queue = new LinkedList<>();
			cnt = 0;
			n = sc.nextInt(); m = sc.nextInt();
			for(int j = 0; j < n; j++)
				queue.add(new int[] {j, sc.nextInt()});
			while(!queue.isEmpty()){
				int[] now = queue.poll();
				boolean b = true;
				for (int[] q : queue)
					if(q[1] > now[1])
						b = false;
				if (b) {
					cnt++;
					if (now[0] == m)
						break;
				}
				else queue.add(now);
			}
			System.out.println(cnt);
		}
	}
}
