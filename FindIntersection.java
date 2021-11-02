package week3.day2Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class FindIntersection {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 3, 2, 11, 4, 6, 7 };
		int arr2[] = { 1, 2, 8, 4, 9, 7 };
		List<Integer> list1 = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
			list1.add(arr2[i]);
		}
		/*
		 * for (int j = 0; j < arr2.length; j++) { list1.add(arr2[j]); }
		 */

		System.out.println(list1);

		Set<Integer> set1 = new HashSet<Integer>();
		boolean b = false;
		for (Integer dumil : list1) {
			if (set1.add(dumil) == false) {
				System.out.println(dumil);
				b = true;
			}

			/*
			 * List<Integer> ar1 = new ArrayList<Integer>(); List<Integer> ar2 = new
			 * ArrayList<Integer>(); for (int i = 0; i < arr1.length; i++) {
			 * ar1.add(arr1[i]); } for (int j = 0; j < arr2.length; j++) { ar2.add(arr2[j]);
			 * }
			 * 
			 * for (Integer test : ar2) { if (ar1.contains(test)) {
			 * System.out.println(test); } }
			 * 
			 * 
			 * /*Old Method for (int i = 0; i < arr1.length; i++) { for (int j = 0; j <
			 * arr2.length; j++) { if (arr1[i] == arr2[j]) { System.out.println(arr1[i]);
			 * 
			 * }
			 * 
			 * } }
			 */

		}
	}
}
