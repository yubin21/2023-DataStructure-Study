// 9012번
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++ ) {
			Stack s = new Stack();
			String str = sc.next();
			for (int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == '(') {
					s.push('(');
				} else if(str.charAt(j) == ')') {
					try {
						s.pop();
					} catch (Exception e){
						s.push('e');
						break;
					}
				}
			}
			if(s.isEmpty())
				System.out.println("YES");
			else if(!s.isEmpty())
				System.out.println("NO");
			
		}
		
	}

}
