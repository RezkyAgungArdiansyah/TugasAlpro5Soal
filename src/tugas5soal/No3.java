package Soal5;

import java.util.Scanner;
import static Soal5.No4.PrintMatriks;
public class No3 {
public static void main (String []args){
double [][] m = InputArray();
int NilaiTrace = Trace(m);
 System.out.println("Trace = " + NilaiTrace);
}
//input array method hal 293
public static double [][] InputArray() { 
Scanner input = new Scanner(System.in);
System.out.print("Masukkan Matriks m*n , \nm = ");
int m = input.nextInt();
System.out.print("n = ");
int n = input.nextInt();
//masukkan nilai array
    double [][] M = new double [m][n];
System.out.println ("\nEnter " + M.length+" baris and " + M[0].length +" kolom: " );
for (int i = 0;i< M.length;i++){
    for(int j = 0;j< M[i].length;j++){
        M[i][j] = input.nextDouble();}}
        PrintMatriks(M);
        return M;
}
public static int Trace (double [][] M){
double sum = 0 ;
for (int i = 0;i <M.length ; i++){
sum = sum + M[i][i];}
return (int) sum;
}}