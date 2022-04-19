/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal5;
import static Soal5.No3.InputArray;
public class No4 {
public static void main (String[]args){
    System.out.println("Masukkan Matriks A");
    double [][] A = InputArray();
    
    System.out.println("Masukkan Matriks B");
    double [][] B = InputArray();
    double [][]Hasil = Perkalian (A,B);
    PrintMatriks(Hasil);
}

public static double[][] Perkalian(double[][] a, double[][] b){
if (a[0].length == b.length){
    System.out.println("Matriks dapat dikalikan " );
    double [][] c = new double [a.length][b[0].length];
    System.out.println("Hasil Kali Matriks berdimensi " + a.length +"*" + b[0].length);
    for (int row = 0;row < a.length;row++){
        for (int column = 0;column < b[0].length;column++){
        int i1 = row;
        int j1 = column;
        int i2 = 0;
        int j2 = 0;
        double sum = 0;
        for (int k = 0;k <a[0].length ;k++){
            sum = sum + a[i1][i2]*b[j2][j1];
            i2++;
            j2++;}
        c [row][column] = sum ;
            }}
        return c;}
else{ 
        System.out.println("Matriks tidak dpt dikalikan ");
        double [][]c = {{404},{404}};
        return c;}
}
public static void PrintMatriks(double [][] M){
System.out.print("Hasil Matriks \n");
for (int i = 0;i < M.length;i++){
    for (int j = 0;j < M[0].length;j++){
    System.out.print(M[i][j]+" ");
    }
    System.out.println();}}
}
