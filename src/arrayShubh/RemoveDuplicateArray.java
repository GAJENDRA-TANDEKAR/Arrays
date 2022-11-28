package arrayShubh;

import java.util.Arrays;

public class RemoveDuplicateArray {
	
	public static void main(String[] args) {
		
		int [] arr = new int [] {1,2,3,4,5,6,7,8,9,3,5,7,9,};
		 System.out.println(" array element is = ");
		 for(int i=0; i<arr.length;i++) {
			 System.out.print(+arr[i]+" ");
		 }
		System.out.println();

		Arrays.sort(arr);   // sorting 1,2,3,3,4,5,5,6,7,7,8,9,9   //  array sort method is used

		System.out.println(" sorting  array element is = ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(+arr[i]+" ");
		}
		 int j=0;
		 for ( int i = 0;i< arr.length - 1 ;i++){
			 if(arr[i] != arr[i+1]){
				 arr[j++] = arr[i];

			 }
		 }
		System.out.println();
		System.out.println(" removed duplicate element =  ");
		arr[j++]  = arr[arr.length-1];
		 for (int k = 0 ; k<j ; k++){

			 System.out.print(arr[k] +" ");
		 }

	}

}
