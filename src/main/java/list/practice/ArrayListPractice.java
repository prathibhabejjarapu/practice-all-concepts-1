package list.practice;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(2);
		nums.add(4);
		nums.add(6);
		nums.add(8);
		// System.out.println(nums);
		for (Integer n : nums) {
			System.out.println(n);
		}
		System.out.println();
		nums.set(1, 10);
		nums.add(12);
		nums.remove(1);
		System.out.println(nums.get(0));
		System.out.println();
		for (int i = 0; i < nums.size(); i++) {

			System.out.println(nums.get(i));
		}
		System.out.println();
		ArrayList<String> names = new ArrayList<String>();
		names.add("chinni");
		names.add("sri");
		names.add("vinu");
		names.add("thota");

		names.remove(3);
		names.set(0, "thota");
		names.add(3, "chinni");
		for (int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
	}

}
