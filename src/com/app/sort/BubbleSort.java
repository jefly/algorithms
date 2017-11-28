package com.app.sort;
import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {5,7,4,1,3,8,2,9,6};
		
		sort(arr);
	}

	private static void sort(int[] arr) {
		
		for(int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr.length -i -1; j++) {
				if(arr[j] > arr[j + 1]){
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
