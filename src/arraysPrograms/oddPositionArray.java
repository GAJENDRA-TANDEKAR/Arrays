package arraysPrograms;

public class oddPositionArray {
	public static void main(String[] args) {
	int [] array = new int [] {1,2,3,4,5,6,7,8,9,10};
	System.out.println("array element present");
	for (int i=0;i<array.length;i++) {
		System.out.print(+array[i] + " ");
	}
	System.out.println();
		System.out.println("odd position array = ");
		
		for(int i = 0; i < array.length; i = i+2 ) {
			System.out.print(" "+array[i]);
		}
		
	
	
	
	}
}


