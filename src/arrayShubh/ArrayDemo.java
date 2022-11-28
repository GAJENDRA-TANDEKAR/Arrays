package arrayShubh;
//  array is colle2ection of data .  which is same type same data type . it is a continueos memory location store.

//The general form of a one-dimensional array declaration is
//
//        type var-name[];
//        OR
//        type[] var-name;


// there are 3 way to create an array
// 1 data type  nameeOfArray [] ;   //  declaration
// 2 data type  nameOfArray []  =  new datatype[size];  // initialition
// 3 data type   nameofArray [] = {val1,val2,val3,....};
//  and also
//  data type  []  nameofArray   =  new  data type [] { ,, element , , , ,};
//  eg-->>  int []original = new int[] {1,2,3,4,5,6,7,8,9,10,3,5,9};



public class ArrayDemo {
    public static void main(String[] args) {

        int rollno[];  // declaration


        rollno = new int[10];  // initialization

        int studentsIds[] = {1, 2, 3, 4, 5, 6, 7};   // size of int 4 byte  abdtotal element 7  -->> 7x4=28 bytes of array total value 28 byte  //  memory size 28 (size of data type * length of array)

        System.out.println("total element = " + studentsIds.length);
        System.out.println(" 0 index" + studentsIds[0]);
        System.out.println(" 1 index" + studentsIds[1]);
        System.out.println(" 2 index" + studentsIds[2]);

        for (int i = 0; i <= studentsIds.length - 1; i++) {
            System.out.print(" , " + studentsIds[i]);
        }

        int evenNumbers[] = new int[11];
        int oddNumber[] = new int[11];
        int j = 0;
        int k = 0;
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                if (j < 11)
                {
                    evenNumbers[j] = i;
                    j++;
                }

            } else {
                    if (k < 11) {
                        oddNumber[k] = i;
                        k++;
                    }

                }
            }
            System.out.println();
            System.out.println(" even number arrays = ");
            for (int i = 1; i <= evenNumbers.length - 1; i++) {
                System.out.println(" evennumber["+i+"] = "+evenNumbers[i] + " ,");
            }
            System.out.println();
            System.out.println(" odd number arrays = ");
            for (int i = 0+1; i <= oddNumber.length - 1; i++) {
                System.out.println(" oddnumber["+i+"] = "+oddNumber[i] + " ,");
            }

        }
    }