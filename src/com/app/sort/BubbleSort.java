package com.app.sort;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {7,4,1,3,8,2,9,6};
		
		sort(arr);
	}

	private static void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++){
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
