package setvslist;

import java.util.*;

public abstract class LinkHaset {
	public static void main(String args[]) {
		// Creating HashSet and adding elements
		LinkedHashSet set = new LinkedHashSet();
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		set.add("Five");

		System.out.println(set);
	}
}
