package arraysPrograms;

public class smallestElementInArray {
	public static void main(String[] args) {
		int[] a1 = new int[] { 99, 44, 66, 33, 88, 22, 55, 11 };
		int min = a1[0];
		System.out.println("array element=");
		for (int i = 0; i < a1.length; i++) {

			System.out.print(+a1[i] + " ");
		}
		for (int i=0;i<a1.length;i++) {
			if(a1[i]<min) {
				min=a1[i];
				
			}
		}
		System.out.println(" smallest element "+min);	

	}
}
