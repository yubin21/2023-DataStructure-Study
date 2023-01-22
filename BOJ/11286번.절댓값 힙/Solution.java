import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Comparator> q = new PriorityQueue<Comparator>();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			if(num == 0) {
				if(q.isEmpty())
					System.out.println("0");
				else
					System.out.println(q.poll().x);
			}
			else
				q.add(new Comparator(num, Math.abs(num)));
		}
	}
}

class Comparator implements Comparable<Comparator> {
	int x, y;
	public Comparator(int x, int y) {
		this.x = x;
		this.y = y;
	}
	@Override
	public int compareTo(Comparator o) {
		if(this.y == o.y)
			return this.x - o.x;
		return this.y - o.y;
	}
}


