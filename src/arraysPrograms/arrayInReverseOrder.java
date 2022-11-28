package arraysPrograms;

public class arrayInReverseOrder {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(" array element ");
                  // for printing original element
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ,");
        }     //   for reverse order
		System.out.println();
		System.out.println("array in reverse order");
		for ( int i = arr.length-1 ;i>=0;i--) {
			
			System.out.print(arr[i]+ " ,");

		

		}

	}
}
