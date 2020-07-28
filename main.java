package main;
import java.util.*;
public class main { 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       transaksi Transaksi =new transaksi();     
       int b;
        System.out.println("------------------------------------------");  
        System.out.println("Apakah Anda Ingin Memesan Tiket Pesawat?");  
        System.out.println("1.YES/IYA");  
        System.out.println("2.NO/TIDAK"); 
        System.out.println("------------------------------------------"); 
        System.out.print("Masukan Pilihan Anda : "); 
 
       do{
       b=input.nextInt();
       if(b>2||b<1){
        System.out.println("Pilih Nomor 1 sampai 2 ");  
       }
       } while(b>2||b<1);
       switch(b){
           case 1:
               Transaksi.home();//step 1
               break;
           case 2:
               System.out.println("Terima Kasih Sudah Menggunakan Aplikasi Ini ^_^"); 
               break;
       }
    }
}
