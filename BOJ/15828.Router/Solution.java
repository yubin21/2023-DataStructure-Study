import java.util.*;

public class Solution {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k;
		Queue<Integer> q = new LinkedList<>();

		while(true) {
			k = sc.nextInt();
			if(k == -1)
				break;
			if (k == 0)
				q.remove();
			else if (n > q.size())
				q.add(k);
		}
		if (q.isEmpty()) {
			System.out.println("Empty");
		}
		else {
			for (int i : q) {
				System.out.print(i +" ");
			}
		}
	}
}
