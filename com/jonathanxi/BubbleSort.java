package com.jonathanxi;

public class BubbleSort {
	public static void main(String[] args) {
		int[] num = {3, 4, 2, 1, 23, 4, -3, 0};
		System.out.println("before sorting, num=");
		printArray(num);
		doBubbleSort(num);
		System.out.println("after sorting, num=");
		printArray(num);
	}
	
	public static void doBubbleSort(int[] num) {
		for (int i = 0; i < num.length - 1; ++i) {
			for (int j = i; j < num.length-1; ++j) {
				if (num[j] > num[j+1]) {
					int tmp = num[j];
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}	
	}
	
	public static void printArray(int[] num) {
		for (int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();	
	}
}
