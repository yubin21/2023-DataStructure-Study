import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		int[][] map = new int [n+1][n+1];

		for(int i = 0; i < k; i++) {
			int indexOne = sc.nextInt();
			int indexTwo = sc.nextInt();
			map[indexOne][indexTwo] = map[indexTwo][indexOne] = 1;
		}

		Queue<Integer> q = new LinkedList<>();
		boolean[] visit = new boolean[n+1];

		q.add(1);
		visit[1] = true;

		int cnt = 0;
		while(!q.isEmpty()) {
			int v = q.poll();
			for(int j = 1; j <= n; j++) {
				if(map[v][j] == 1 && !visit[j]) {
					visit[j] = true;
					q.add(j);
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

}
