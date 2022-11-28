package arraysPrograms;

public class sortElementInDecending {
	public static void main(String[] args) {

		int[] a = new int[] { 66, 77, 88, 99, 44, 22, 33, 55, 11 };
		int temp = 0;
		System.out.println("number present");
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i] + " ");

		}
		System.out.println();
		System.out.println("sorting element in decending order = ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i] + " ");

		}
	}
}
