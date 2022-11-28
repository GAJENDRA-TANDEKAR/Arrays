package arrays30;

public class CopyElementOneToAnother {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int b []  = new int[a.length];

        System.out.println(" Array of a element is present = ");
        for (int i = 0; i< a.length; i++) {  /// for printing a element
            System.out.print(a[i]+" ,,");
        }
        System.out.println();
        //for printing b  copy  a element in the b
        for (int i=0; i<a.length;i++){              //logic
           b [i]  =  a[i];     // copy a element in b  // declare  only  variable

            System.out.print( b[i]+" ,");
        }

    }
}