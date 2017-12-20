package com.app.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {14,93,46,38,51,7,80,63};
		
		sort(arr);
	}


	private static void sort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++){
			for (int j = i + 1; j < n; j++) {
				int k = j;
				if(arr[k - 1] > arr[k]){
					
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
					--k;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}}
