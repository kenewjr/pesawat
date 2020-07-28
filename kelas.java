package main;
import java.util.*;

public class kelas {
    String lks;
    int tiketdws,tiketank,dws,ank,ttlharga,bayar,kembalian;
     Scanner myvar = new Scanner(System.in);
     hasil hs = new hasil();
     
 class hasil{
private String lk = "";
private int dewasa=0;
private int anak=0;
private int ttlharga=0;
private int ank=0;
private int dws=0;
private int kembalian=0;

        public int getKembalian() {
            return kembalian;
        }

        public void setKembalian(int kembalian) {
            this.kembalian = kembalian;
        }

public String getLK(){
return lk;
}
public int getDewasa(){
    return dewasa;
}
public int getAnak(){
    return anak;
}
public int getDws(){
    return dws;
}
public int gettotal(){
    return ttlharga;
}
public int getAnk(){
    return ank;
}

public void setDws(int newgetDws){
this.dws = newgetDws;
}
public void setAnk(int newgetAnk){
this.ank = newgetAnk;
}
public void settotal(int newgettotal){
this.ttlharga = newgettotal;
}
public void setLK(String newgetLK){
this.lk = newgetLK;
}
public void setDewasa(int newgetDewasa){
this.dewasa = newgetDewasa;
}
public void setAnak(int newgetAnak){
this.anak = newgetAnak;
}
 }   
void listkelas(){//step 7
     System.out.println("------------------------------------------"); 
     System.out.println("kelas maskapai ");
     System.out.println("1.Economy Class ");
     System.out.println("2.Business Class  ");
     System.out.println("3.First Class  ");
     System.out.println("------------------------------------------"); 
     System.out.print("Pilih kelas maskapai : ");
            }
void jmltiket(){//step 9
    System.out.println("------------------------------------------"); 
     System.out.println("Masukan jumlah tiket  ");
    System.out.print("Dewasa : ");
    tiketdws=myvar.nextInt();
    System.out.print("Anak : ");
    tiketank=myvar.nextInt();
    
}
void economy (){
    lks="Economy Class";
    jmltiket();//mengambil data dari jmltiket
    dws=tiketdws*5000;
    ank=tiketank*3000;
    bayar();//mendaptakan total harga dari bayar
    getset();//untuk memberikan nilai pada variabel
      
        }
void bisnis(){
    lks="Business Class";
    jmltiket();//mengambil data dari jmltiket
    dws=tiketdws*5500;
    ank=tiketank*3500;
   bayar();//mendaptakan total harga dari bayar
    getset();//untuk memberikan nilai pada variabel
}

void first(){
    lks="First Class";
    jmltiket();//mengambil data dari jmltiket
    dws=tiketdws*6000;
    ank=tiketank*4000;
    bayar();//mendaptakan total harga dari bayar
    getset();//untuk memberikan nilai pada variabel
}
void getset(){
    hs.setLK(lks);  //menyimpan data kelas maskapai
    hs.setDewasa(tiketdws);//menyimpan data tiket dewasa
    hs.setAnak(tiketank);//menyimpan data tiket anak
    hs.setDws(dws);//menyimpan harga dewasa
    hs.setAnk(ank);//menyimpan harga anak
    hs.settotal(ttlharga);//menyimpan data total harga keseluruhan
    hs.setKembalian(kembalian);//menyimpan data kembalian
   
}
void bayar(){//step 10
    ttlharga=dws+ank;    
    System.out.println("------------------------------------------"); 
    System.out.println("total pembayaran: " +ttlharga);
    System.out.println("------------------------------------------"); 
    System.out.print("Masukan total Pembayaran : "); 
     do{
    bayar=myvar.nextInt();
    if(bayar<ttlharga){
    System.out.print("Uang kurang Coba lagi : "); 
    }
    }while(bayar<ttlharga);
    kembalian=bayar-ttlharga;
    System.out.println("kembalian anda : Rp."+kembalian);    
}
}
