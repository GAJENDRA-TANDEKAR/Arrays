package arraysPrograms;

public class findDuplicateElement {
	
	public static void main(String[] args) {
		
		int []original = new int[] {1,2,3,4,5,6,11,7,8,9,10,3,5,11,9};
		 System.out.print(" original array");
		 for (int i=0;i<original.length;i++) {
			  System.out.print(original[i]+ "  ");
			}
			  System.out.println("Duplicate element ");
		for(int i=0;i<original.length;i++) {
			for (int j=i+1;j<original.length;j++) {
				if(original[i] == original[j] ) {
					System.out.println(original[j]);
					
				}
				
			}
		}
	}

}
