package arraysPrograms;

public class evenOddFromArray {
	public static void main(String args[]) {

		int[] a = new int[] { 11,22,33,44,55,66,77,88,99 };

		System.out.println("Odd Numbers");

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Even Numbers=");

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i]+" ");
			}
		}
	}
}
