package week3.day2Assignments;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicates {

	public static void main(String[] args) {

		/*
		 * 10,24,32,64,85,37,12,10
		 * 
		 * 
		 */

		int[] nums = { 10, 24, 64, 32, 64, 85, 37, 12, 10 };
		boolean b = false;
		Set<Integer> unique = new TreeSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (unique.add(nums[i]) == false) {
				System.out.println("Duplicte culprit is: " + nums[i]);
				b = true;
			}
		}
		
		if (!b)
			System.out.println("All are unique numbers");
		// System.out.println("Unique numbers are : " +unique);
		System.out.println(unique.size());

	}

}
