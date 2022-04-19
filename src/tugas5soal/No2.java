/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal5;

import java.util.Scanner;
public class No2 {
    public static void main (String [] args){
    Scanner inputan = new Scanner(System.in);
    System.out.println("*Program Mengecek bilangan prima atau bukan*");
    int k = 1;
    while (k == 1){
    System.out.print("Masukkan bilangan = ");
    int angka = inputan.nextInt();
    if (angka >= 2){
    if (Prima(angka))
    System.out.println(angka +" Adalah Bilangan prima");
    else
    System.out.println(angka +" bukan Bilangan prima");
    System.out.print("Apakah anda mau lanjut ? (1 untuk lanjut / 0 untuk berhenti), pilihan anda = ");
    k = inputan.nextInt();}
    else{
    System.out.print("Anda salah memasukkan bilangan ");
    continue;
    }}
}
    public static boolean Prima(int x){
    for (int pembagi = 2;pembagi <= x/2;pembagi ++){
    if (x % pembagi ==0)
        return false;
        }
    return true;
}
}
