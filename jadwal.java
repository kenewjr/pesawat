
package main;
import java.util.*;
import java.text.SimpleDateFormat;

public class jadwal{
    SimpleDateFormat formatter=new SimpleDateFormat("dd/MM/yyyy");
    Date date =new Date();	 
    Scanner var=new Scanner(System.in);
    int jdwl;
    String takeoff;    
    jdwlterbang jam = new jdwlterbang();
    
    class jdwlterbang{
    private String takeoff;
    
    public String getJadwal(){
    return takeoff;
    }
    public void setJadwal(String newJadwal){
    this.takeoff = newJadwal;
      }
    }
	void garuda() {
             System.out.println("------------------------------------------"); 
             System.out.println("1. " + formatter.format(date) +" 11:00 - 13:00");
             System.out.println("2. " + formatter.format(date) +" 14:00 - 16:00");
             System.out.println("3. " + formatter.format(date) +" 18:00 - 20:00");
             System.out.println("------------------------------------------"); 
             System.out.print("pilih waktu penerbangan anda : ");
               do{
            jdwl=var.nextInt();
            if(jdwl>3||jdwl<1){
             System.out.println("Mohon Maaf Jadwal Tidak tersedia ");
             System.out.println("Silahkan input 1,2 dan 3");
            }
            if(jdwl==1){ 
             takeoff=(formatter.format(date) +" 11:00 - 13:00");
            }else if(jdwl==2){
             takeoff=(formatter.format(date) +" 14:00 - 16:00");
            }else if(jdwl==3){
             takeoff=(formatter.format(date) +" 18:00 - 20:00");
            }
            }while(jdwl>3||jdwl<1);
           System.out.println(takeoff);
             jam.setJadwal(takeoff);
    }
        void AirAsia() {      
             System.out.println("1. "+ formatter.format(date) +" 09:00 - 11:00");
             System.out.println("2. "+ formatter.format(date) +" 14:00 - 17:00");
             System.out.println("3. "+ formatter.format(date)+" 19:00 - 21:00");
             System.out.println("------------------------------------------"); 
             System.out.print("pilih waktu penerbangan anda : ");
               do{
            jdwl=var.nextInt();
            if(jdwl>3||jdwl<1){
             System.out.println("Mohon Maaf Jadwal Tidak tersedia ");
             System.out.println("Silahkan input 1,2 dan 3");
            }
            if(jdwl==1){
             takeoff=(formatter.format(date) +" 09:00 - 11:00");
            }else if(jdwl==2){
             takeoff=(formatter.format(date) +" 14:00 - 17:00");
            }else if(jdwl==3){
             takeoff=(formatter.format(date) +" 19:00 - 21:00");
            }
            }while(jdwl>3||jdwl<1);
             System.out.println(takeoff);
             jam.setJadwal(takeoff);
      
    }
         void BatikAir() {           
             System.out.println("1. "+formatter.format(date)+" 09:00 - 12:00");
             System.out.println("2. "+formatter.format(date)+" 14:00 - 17:00");
             System.out.println("3. "+formatter.format(date)+" 19:00 - 20:00");
             System.out.println("------------------------------------------"); 
             System.out.print("pilih waktu penerbangan anda : ");
             do{
            jdwl=var.nextInt();
            if(jdwl>3||jdwl<1){
             System.out.println("Mohon Maaf Jadwal Tidak tersedia ");
             System.out.println("Silahkan input 1,2 dan 3");
            }
            if(jdwl==1){         
             takeoff=(formatter.format(date) +" 09:00 - 12:00");
            }else if(jdwl==2){
             takeoff=(formatter.format(date) +" 14:00 - 17:00");
            }else if(jdwl==3){
             takeoff=(formatter.format(date) +" 19:00 - 20:00");
            }
            }while(jdwl>3||jdwl<1);
              System.out.println(takeoff);
              jam.setJadwal(takeoff);   
    }  
}
