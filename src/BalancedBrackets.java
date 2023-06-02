import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedBrackets {
	static boolean isMatching(Character a, Character b) {
		return((a=='('&&b==')')||(a=='{'&&b=='}')||(a=='['&&b==']'));
	}
	public static String isBalanced(String s) {
		// Write your code here
		Stack<Character> bracketStack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
				bracketStack.push(s.charAt(i));
			} else {
				if (bracketStack.isEmpty()) {
					return "NO";
				}
				else if(!isMatching(bracketStack.peek(), s.charAt(i))) {
					return "NO";
				}
				else {
					bracketStack.pop();
				}

			}
		}
		return bracketStack.isEmpty() ? "YES" : "NO";

	}

	public static void main(String[] args) {
		String str = "{[(])}";
		System.out.println(isBalanced(str));

	}
}
