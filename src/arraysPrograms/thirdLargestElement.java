package arraysPrograms;

public class thirdLargestElement {
	public static void main(String[] args) {
		
		int [] a = new int [] {22,55,44,88,77,66,99,100};
		int temp,size ;
		size=a.length;
		
		System.out.println("array elements = ");
		for (int i=0;i< a.length;i++) {
			System.out.print(+a[i]+" ");
		}
		System.out.println();
		System.out.println("3rd largest element =");
		for (int i=0;i< size;i++) {
			for(int j=i+1;j<size;j++) {
				if(a[i]>  a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}

			}
			System.out.print(a[i]+" ");

		}
		System.out.println();
		System.out.println("3rd element");
		System.out.print(+a[size-3]+" ");

		}
		

}
