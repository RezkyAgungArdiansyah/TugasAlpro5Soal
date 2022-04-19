package Soal5;
import java.util.Scanner;
public class No5 {    
public static void main (String[]args){
Scanner inputan = new Scanner(System.in);
//DeckeBin1(desimal);
int k = 1;
while (k == 1){
System.out.print("Masukkan pilihan anda \n1:Desimal ke Biner \n2:Biner ke Desimal \npilihan anda = ");
int pilihan = inputan.nextInt();
switch (pilihan){
    case 1 -> {
        System.out.print("Masukkan bilangan desimal = ");
        int desimal = inputan.nextInt();
        DeckeBin2(desimal);
        }
    case 2 -> {
        System.out.print("Masukkan bilangan Biner = ");
        int biner = inputan.nextInt();
        BinkeDec(biner);
        }
}
    System.out.print(" \nApakah anda ingin lanjut (1 lanjut / 0 berhenti) \npilihan anda = ");
    k = inputan.nextInt();
}}
public static void BinkeDec (int biner){
int length =(int)(Math.log10(biner)+1);
int sum = 0;
for (int k =0;k < length;k++){
    sum =(int) (sum + (biner%10)*Math.pow(2,k));
    biner =biner/ 10;}
System.out.println ("Biner ke desimal = " + sum);}
public static void DeckeBin1 (int desimal){
    System.out.println("Desimal ke Biner");
    while (desimal != 1){
    System.out.print(desimal%2);
    desimal = desimal / 2;}
    System.out.print(desimal);
    System.out.println(" Baca Dari Belakang");}
public static void DeckeBin2 (int desimal){
System.out.println("Desimal ke Biner");
int count = 0;
int div = desimal;
while (div !=1){
    div = (int)div/2;
    count ++;}
    count ++;
int [] M = new int [count];
    for (int i =  0; i < count;i++){
    M[count-i-1]=desimal%2;
    desimal =(int) desimal / 2;}
PrintMatriks (M);}
public static void PrintMatriks(int [] M){
System.out.print("Hasil Matriks \n");
for (int i = 0;i < M.length;i++){
    System.out.print(M[i]);}}
}
