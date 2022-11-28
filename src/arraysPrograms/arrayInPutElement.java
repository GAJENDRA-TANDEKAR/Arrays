package arraysPrograms;

import java.util.Scanner;

public class arrayInPutElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("enter no. of elements you want in array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter all the elements:");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("array of element is == ");
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
