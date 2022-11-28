package arraysPrograms;

public class sumOfArray {
	public static void main(String[] args) {
                          //  0  , 1, 2  , 3
		int[] a = new int[] { 10, 20 ,30, 60};
		int sum=0;
		//int b= 0;
		//int c =0;
		System.out.println("number present");
		for (int i = 0; i < a.length; i++) {
			System.out.print(+a[i] + " ");

		}
		System.out.println();
		System.out.print("sum of all element = ");
		                                         
		                                             //         1 =0                   2  5        4  7
		for (int i = 0; i < a.length; i++) {         // for  ( initialization ;   condition  ; incrementation)   
			sum = sum + a[i];  //10  ,30 , 60           //      body ; 3 , 6
			//b =b + a[i];
			//c=b;
		}

		//System.out.println(+b);
		System.out.println(+sum);
		
	}

}
