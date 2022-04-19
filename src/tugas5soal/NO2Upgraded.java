
package Soal5;

//import static Soal5.No2.Prima;
import java.util.Scanner;

public class NO2Upgraded {
    public static void main (String [] args){
    Scanner inputan = new Scanner(System.in);
    System.out.println("*Program Mengecek bilangan prima atau bukan*");
    int k = 1;
 
    while (k == 1){
    System.out.print("Masukkan bilangan = ");
    int angka = inputan.nextInt();
    if (angka >= 2){
    //body pengecekan
    if (Prima2(angka))
        System.out.println(angka +" Bilangan prima");
    else
        System.out.println(angka +" bukan Bilangan prima");
    System.out.print("apakah anda mau lanjut ? (1 untuk lanjut / 0 untuk berhenti), pilihan anda = ");
    k = inputan.nextInt();}
    
    else{
    System.out.print("Anda salah memasukkan bilangan ");}
    }}
    
    public static boolean Prima2 (int bil){
    if (bil ==2 || bil == 3 )
        return true;
    else if (bil%6 == 1 || bil%6 ==5){
         for (int i = 2 ; i <= (bil/6) + 3 ; i++){
         if (bil%i == 0)
           return false;}
        return true;}
    else
        return false;
    }}
