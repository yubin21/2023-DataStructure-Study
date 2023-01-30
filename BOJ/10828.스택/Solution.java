import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack <Integer> s = new Stack<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();

			if (str.equals("push"))
				s.push(Integer.parseInt(st.nextToken()));
			if (str.equals("pop")) {
				if (s.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(s.pop());
				}
			}

			if (str.equals("size"))
				System.out.println(s.size());

			if (str.equals("empty")) {
				if (s.isEmpty()) {
					System.out.println("1");
				} else {
					System.out.println("0");
				}
			}

			if (str.equals("top")) {
				if (s.isEmpty()) {
					System.out.println("-1");
				} else {
					System.out.println(s.peek());
				}
			}
		}

	}

}
