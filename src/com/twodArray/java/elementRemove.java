package com.twodArray.java;

public class elementRemove {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int[] arr1 = new int [arr.length-1];
		int y = 0;
		int remove = 3;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (remove != arr[i]) {
				arr1[y] = arr[i];
				y++;
			}
		}
		for (int x : arr1) {
			System.out.println(x);
		}
	}
}