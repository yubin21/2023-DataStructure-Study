import java.util.*;
import java.io.*;

public class Solution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> o2 - o1);

		int n = Integer.parseInt(br.readLine());

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(q.isEmpty())
					System.out.println("0");
				else
					System.out.println(q.poll());
			}
			else
				q.offer(num);
		}
	}

}
