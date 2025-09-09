package learnJava.collections.set;

import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treesetDemo = new TreeSet<Integer>();
		treesetDemo.add(29);
		treesetDemo.add(82);
		treesetDemo.add(45);
		treesetDemo.add(52);
		treesetDemo.add(21);
		treesetDemo.add(2);
		treesetDemo.add(145);
		System.out.println(treesetDemo);
		System.out.println(treesetDemo.floor(45));
		System.out.println(treesetDemo.lower(45));
		System.out.println(treesetDemo.ceiling(45));
		System.out.println(treesetDemo.higher(45));
		
		/*
		| Method Call   | Meaning               | Result                         |
		| ------------- | --------------------- | ------------------------------ |
		| `treesetDemo` | Print full TreeSet    | `[2, 21, 29, 45, 52, 82, 145]` |
		| `floor(45)`   | Greatest element ≤ 45 | `45`                           |
		| `lower(45)`   | Greatest element < 45 | `29`                           |
		| `ceiling(45)` | Smallest element ≥ 45 | `45`                           |
		| `higher(45)`  | Smallest element > 45 | `52`                           |
*/
	}

}
