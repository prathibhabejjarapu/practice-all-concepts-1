package set.practice;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {

	public static void main(String[] args) {
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.remove(1);
		System.out.println(nums.contains(2));
		for (Integer n : nums) {

			System.out.println(n);
		}
	}

}
