package arraysPrograms;

import java.util.Scanner;

public class toCheckEvenOddNumber
{
   public static void main(String[] args)
   {
      int num;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter a Number: ");
      num = scan.nextInt();
      
      if(num%2==0)
      {
         System.out.println(" Even Number.");
      }
      else
      {
         System.out.println(" Odd Number.");
      }
   }
}