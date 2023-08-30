package setvslist;

import java.util.*;

public class SetVsList {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(20);
		al.add("sidd");
		al.add(20);
		al.add(null);
		System.out.println(al);
		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("__________________________________");
		// set exp
		// public static void method() {
		System.out.println("SET EXAMPLE");
		Set s = new HashSet();
		s.add(100);
		s.add(40);
		s.add(30);
		s.add("sid");
		s.add(100);
		s.add(40);
		s.add(30);
		s.add("sid");
		Iterator itr2 = s.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());

		}
	}
}
