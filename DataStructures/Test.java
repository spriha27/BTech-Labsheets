//package Stacks;

public class Test{
		public static void main(String args[]){
			StackChar si = new StackChar();
			StackChar si1 = new StackChar();
			StackChar si2 = new StackChar();
			String s = "{(){[()]}";
			String s1 = "(A+B)/(C-D)";
			String s2 = "123*+4-";
			boolean d = si.parenthesisCheck(s);
			System.out.println(d);
			String a = si1.convert(s1);
			System.out.println(a);
			char b = si2.infixEvaluator(s2);
			System.out.println(b);
	}
}
