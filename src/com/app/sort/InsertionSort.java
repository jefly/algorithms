package com.app.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = {14,93,46,38,51,7,80,63};
		
		sort(arr);
	}


	private static void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++){
			
			int index = i;
			int key = arr[i];
			int temp;
			
			if(i == 0){
				continue;
			}
			
			while(index > 0 && key < arr[index - 1]){
				
				if(arr[index - 1] > key){
					temp = arr[index - 1];
					arr[index] = temp;
					arr[index - 1] = key;
				}
				
				--index;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
