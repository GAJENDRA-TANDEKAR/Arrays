package arraysPrograms;

public class printElementInArray {
	public static void main(String[] args) {

		int[] arr1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 ,10,11 };
		System.out.println("array element=");
		for (int i = 0; i < arr1.length; i++) {
			
			System.out.print(+arr1[i] + " ");
		}
		System.out.println();
        System.out.println("number of element is present in the array = "+arr1.length );
	}
}
