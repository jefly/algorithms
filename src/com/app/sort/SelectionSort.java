package com.app.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {23,64,15,32,89,70};
		
		sort(arr);
	}

	private static void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++){
			System.out.println(Arrays.toString(arr));
			for(int j = i + 1; j < arr.length; j++){
				if(arr[i] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
				
			}
		}
		
		
	}
}
