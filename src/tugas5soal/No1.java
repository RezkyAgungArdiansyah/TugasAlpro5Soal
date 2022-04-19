
package Soal5;

public class No1 {

public static void main (String []args) {
 // Passing By Value
 System.out.println("Passing By Value");
 int num1 = 1;
 int num2 = 2;
 
 System.out.println("Before invoking the swap method, num1 = " + num1 + " and num2 = " + num2);
 swap (num1 , num2);
 System.out.println("After invoking the swap method, num1 = " + num1 + " and num2 = " + num2);
//Passing By Reference
System.out.println();
System.out.println("Passing By Reference");

int [] a = {1, 2};
System.out.println("Before General Swap " + a[0] + " and " + a[1]);
swap (a[0],a[1]);
System.out.println("After Outside Method General Swap " + a[0] +" and "+ a[1]);

System.out.println();
System.out.println("Before Array Swap " + a[0] + " and " + a[1]);
SwapArray (a);
System.out.println("After Outside Method Array Swap " + a[0] +" and "+ a[1]);
}


public static void swap (int n1, int n2){
//System.out.println("\tInside the swap method");
//System.out.println("\t\tBefore swapping, n1 = " + n1 + " and n2 = " + n2);

int temp = n1;
n1 = n2;
n2 = temp;

//System.out.println("\t\tAfter swapping, n1 = " + n1 + " and n2 = " + n2);
}
public static void SwapArray (int [] array){
int temp = array [0];
array [0] = array [1];
array [1] = temp;
}}    
