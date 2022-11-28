package arraysPrograms;

public class secondLargestElement {
	public static void main(String[] args) {
		
		int [] a = new int [] {22,55,44,77,88,99,100,33,999};
		int temp,size ;
	//	size=a.length;
		
		System.out.println("array elements = ");
		for (int i=0;i< a.length;i++) {
			System.out.print(+a[i]+" ");
		}
		System.out.println();
		System.out.println("2rd largest element =");
	//	for (int i=0;i< size;i++) {
	//		for(int j=i+1;j<size;j++) {
		for (int i=0;i< a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		int max1=a[0];
		int max2=a[1];
		for (int i=1;i<a.length;i++) {
			if(a[i]>max1) {
				max1=a[i];
			}

			if ( max2 < max1 && a[i]>max2){
				max2 = a[i];
			}
		}
		System.out.println(+a[1]+" ");
		System.out.println(max1+" "+max2);
		}

		
}
