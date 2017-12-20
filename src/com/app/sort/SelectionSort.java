package com.app.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] arr = {23,64,15,32,89,70};
		
		sort(arr);
	}

	private static void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++){
			
			int minValue = arr[i];
			int minIndex = i;
			int temp;
			
			for(int j = i + 1; j < arr.length; j++){

				if(minValue > arr[j]){
					minValue = arr[j];
					minIndex = j;
				}
			}
			
			temp = arr[i];
			arr[i] = minValue;
			arr[minIndex] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
