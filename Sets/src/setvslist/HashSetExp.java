package setvslist;

import java.util.HashSet;
import java.util.Set;

public class HashSetExp {
	public static void main(String[] args) {
		System.out.println("SET EXAMPLE");
		Set hs = new HashSet();
		hs.add(100);
		hs.add(40);
		hs.add(30);
		hs.add("sid");
		hs.add(100);
		hs.add(40);
		hs.add(30);
		hs.add("sid");
		System.out.println(hs);
		/*
		 * Set hs1=new HashSet(); hs1.addAll(hs); System.out.println(hs1);
		 */
	}
}
