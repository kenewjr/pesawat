package main;

import java.util.Scanner;

public class transaksi {
    Scanner myvar = new Scanner(System.in);
    jadwal waktu= new jadwal();
    kelas maskapai=new kelas();
    main input=new main();
    String nama,merek,kelasmsk,jadwal;
String[] tujuan = {"Jakarta - surabaya",
        "Jakarta - bali",
        "Jakarta - yogyakarta",
        "Bali - Jakarta",
        "Bali - Surabaya",
        "Bali - yogyakarta",
        "Surabaya - jakarta",
        "Surabaya - bali"};
    private String tjn ="";
    String []merekpewasat ={"Garuda Indonesia","Air Asia","BatikAir"};
    int kelas,anak,dewasa,ta,td,ttl,b,titik,kmbl;
    
    void home(){
         menu();//step 2
          do{
       b=myvar.nextInt();
       if(b>3||b<1){
        System.out.println("Maskapai Tidak Tersedia ");  
        System.out.println("PIlih Nomor 1 sampai 3 ");  
       }
       } while(b>3||b<1);
        if(b==1){
               garuda();
        }else if(b==2){          
               air();
        }else if(b==3){       
               batik();           
        }       
    }
   
    void display(){
       objek();//penyimpanan proses kelas lain
       System.out.println("------------------------------------------"); 
        System.out.println("Informasi Pembelian Tiket ");
        System.out.println("Nama : "+nama);
        System.out.println("Maskapai : "+merek);
        System.out.println("Tujuan Penerbangan : "+tjn);
        System.out.println("Kelas Maskapai : "+kelasmsk);  
        System.out.println("Jenis Penumpang : ");
        System.out.println(dewasa+" Dewasa Rp."+td);
        System.out.println(anak+" Anak-Anak Rp."+ta);
        System.out.println("Jam Penerbangan : "+jadwal);
         System.out.println("Kembalian = Rp."+kmbl);  
        System.out.println("Total Harga Tiket = Rp."+ttl);  
        System.out.println("------------------------------------------"); 
    }
    void menu(){//step 5
         alurtujuan();//step 3
         System.out.println("List Maskapai ");
         System.out.println("1.Garuda Indonesia ");
         System.out.println("2.Air Asia ");
         System.out.println("3.Batik Air ");
         System.out.println("------------------------------------------"); 
         System.out.print("Pilih Maskapai : ");
    }
    void awal(){//step 6
         if(b==1){
      System.out.println("------------------------------------------"); 
      System.out.println("Selamat datang di Garuda Indonesia");
     }else if(b==2){
       System.out.println("------------------------------------------"); 
       System.out.println("Selamat datang di Air Asia");
     }else if(b==3){
       System.out.println("------------------------------------------"); 
       System.out.println("Selamat datang di Batik Air");
     }
    System.out.println("------------------------------------------");  
    System.out.println("Silahkan isi formulir dibawah ini");
    System.out.print("masukan nama anda : ");
    nama=myvar.next();
     do{        
     maskapai.listkelas();//mengambil dari source code kelas
     do{
     kelas=myvar.nextInt();//input si kelas
     if(kelas>3|| kelas<1){
             System.out.println("Masukan pilihan nomor 1,2 dan 3");
     }
     }while(kelas>3||kelas<1);
     //step 8
     //mengambil dari kelas jadwal
     if(b==1){
     waktu.garuda();
     }else if(b==2){
      waktu.AirAsia();
     }else if(b==3){
      waktu.BatikAir();
     }
     }while(kelas>3||kelas<1);
     if(kelas==1){//mengambil source code dari kelas
         maskapai.economy();
     }else if(kelas==2){
         maskapai.bisnis();
     }else if(kelas==3){
         maskapai.first();
     }
    }
    
    //step 11
    void garuda(){
    awal();//proses pengambil data dari kelas lain
    display();   //menampilkan output keseluruhan
    }
    
    void air(){
    awal();//proses pengambil data dari kelas lain
    display(); //menampilkan output keseluruhan  
    }
    
    void batik(){
    awal();//proses pengambil data dari kelas lain
    display();   //menampilkan output keseluruhan
    }
   
    
    void alurtujuan() {//step 4
        System.out.println("------------------------------------------"); 
        System.out.println("selamat datang di travelui ");
        System.out.println("List Tujuan Yang Tersedia ");
        System.out.println("1.Jakarta - surabaya ");
        System.out.println("2.Jakarta - bali ");
        System.out.println("3.Jakarta - yogyakarta ");
        System.out.println("4.Bali - Jakarta");
        System.out.println("5.Bali - Surabaya ");
        System.out.println("6.Bali - yogyakarta");
        System.out.println("7.Surabaya - jakarta ");
        System.out.println("8.Surabaya - bali");
        System.out.println("------------------------------------------"); 
        System.out.print("silahkan pilih tujuan penerbangan : ");
        do {
            titik = myvar.nextInt();
            if (titik > 8 || titik < 1) {
                System.out.println("Mohon Maaf Tujuan Yang anda pilih tidak tersedia ");
                System.out.print("Mohon masukan Input 1 sampai 8 : ");
            }
                 
        } while (titik > 8 || titik < 1);
        tjn = tujuan[titik - 1];  //mengambil dari array tujuan
        System.out.println("------------------------------------------"); 
        System.out.println("Tujuan Yang Anda Pilih : " + tjn);
       

    }
    
    void objek(){
       
        kelasmsk=maskapai.hs.getLK();//mengambil listkelas
        anak=maskapai.hs.getAnak();     //mengambil total anak
        dewasa=maskapai.hs.getDewasa();//mengambil total dewasa
        ta=maskapai.hs.getAnk();//mengambil total harga anak
        td=maskapai.hs.getDws();//mengambil total harga dewasa
        ttl=maskapai.hs.gettotal();//mengambil total harga keseluruhan
        jadwal=waktu.jam.getJadwal();
        merek = merekpewasat[b-1];//mengambil dari array merek pesawat
        kmbl=maskapai.hs.getKembalian();//mengambil kembalian dari kelas
          }
}
