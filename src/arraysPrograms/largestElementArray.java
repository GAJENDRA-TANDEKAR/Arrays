package arraysPrograms;

public class largestElementArray {
	public static void main(String[] args) {
		int[] a1 = new int[] { 99, 44, 66, 33, 88, 22, 55, 11 };
		int max = a1[0];
		System.out.println("array element=");
		for (int i = 0; i < a1.length; i++) {

			System.out.print(+a1[i] + " ");
		}
		for (int i=0;i<a1.length;i++) {
			if(a1[i]>max) {
				max=a1[i];
				
			}
		}
		System.out.println(" Largest element "+max);	

	}
}



