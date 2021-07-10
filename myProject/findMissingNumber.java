package myProject;

public class findMissingNumber {
	public static void main(String[] args) {
		
		int arr[]=new int[]{30,40,20,60};
		int arr2[]=new int[] {30,40,0,60};
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<arr.length;i++) {
			
				
				 sum1 += arr[i];
			
		}
		for(int i=0;i<arr2.length;i++) {
			
			
			 sum2 += arr2[i];
		
		}
		System.out.println(sum1-sum2);
	}
}
