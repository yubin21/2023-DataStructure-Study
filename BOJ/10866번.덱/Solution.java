import java.util.*;
import java.io.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<Integer>();

		for (int i = 0; i <n ; i++) {
			String str = br.readLine();
			String array[] = str.split(" ");

			str = array[0];
			// System.out.println("---- 읽기 ---- = "+str+"\ntype == "+str.getClass().getName());

			if(str.equals("push_front")) {
				deque.addFirst(Integer.parseInt(array[1]));
			}
			else if(str.equals("push_back")) {
				deque.addLast(Integer.parseInt(array[1]));
			}
			else if(str.equals("pop_front")) {
				if(deque.size()<1) {
					System.out.println(-1);
				}
				else {
					System.out.println(deque.pollFirst());
				}
			}
			else if(str.equals("pop_back")) {
				if(deque.size()<1) {
					System.out.println(-1);
				}
				else {
					System.out.println(deque.pollLast());
				}
			}
			else if(str.equals("size")) {
				System.out.println(deque.size());
			}
			else if(str.equals("empty")) {
				if(deque.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
			}
			else if(str.equals("front")) {
				if(deque.size()<1) {
					System.out.println(-1);
				}
				else {
					System.out.println(deque.peekFirst());
				}
			}
			else if(str.equals("back")) {
				if(deque.size()<1) {
					System.out.println(-1);
				}
				else {
					System.out.println(deque.peekLast());
				}

			}
		}
	}
}