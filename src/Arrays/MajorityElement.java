package Arrays;

import java.util.HashMap;

 public class MajorityElement {

	public static void main(String[] args) {

		// TC 1 int a[] = { 2, 3, 4, 4, 4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		// TC 2 int a[]={3, 3, 4, 2, 4, 4, 2, 4, 4};

		int a[] = { 3, 3, 3, 3, 4, 4, 2, 4 ,3,3,3};
		final int rule = a.length / 2 + 1;
		boolean foundFlag = false;
		int temp = -1;
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int num : a) {

			if (hm.containsKey(num)) {
				temp = hm.get(num);
				if (temp + 1 >= rule) {
					foundFlag = true;
					temp = num;
					break;
				}
				hm.put(num, temp + 1);
			} else {
				hm.put(num, 1);
			}

		}

		if (true == foundFlag) {
			System.out.println("Found Value: " + temp);
		} else {
			System.out.println("NONE");
		}

	}
}
