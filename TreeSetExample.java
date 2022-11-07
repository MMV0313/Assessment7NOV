package com.pack;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> st = new TreeSet<Integer>();

		st.add(36);
		st.add(34);
		st.add(546);
		st.add(65);
		st.add(34);

		st.add(56);
		st.add(96);
		st.add(396);
		System.out.println(st);
		int a = st.size();
		int[] arr = new int[a];

		for (int num : st) {
			for (int i = a - 1; i < 0; i++) {
				arr[i] = num;
				break;
			}
		}
		System.out.println(arr);
	}
}