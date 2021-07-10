package myProject;

import java.util.Arrays;

public class secondMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[]{30,40,20,10};
		
		Arrays.sort(arr);
		System.out.println("max in array : "+arr[arr.length-1]);
		System.out.println("Second max in array : "+arr[arr.length-2]);
		
	}

}
