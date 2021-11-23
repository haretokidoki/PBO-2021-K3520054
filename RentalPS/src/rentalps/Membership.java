/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Membership {
    public ArrayList<String> member = new ArrayList<String>(
            Arrays.asList("M001,Mr.X,Silver","M002,Mr.Y,Gold","M003,Mr.Z,Platinum")
    );
    public Scanner input = new Scanner(System.in);
    public String datax;
    public long period;
    private LocalDate from,to;
    private int index,loop;
    
    void inputData(){ 
        loop = 1;
        while (loop == 1){
            int x = 0;
            System.out.print("Masukkan ID Member :");
            String idm = input.nextLine();
            while (member.size() > x){
                String mm = member.get(x).substring(0,4);
                if (idm.equals(mm)) {
                    this.datax = member.get(x);
                    loop = 0;
                }
                x++;
            }
            if(loop == 1){
                System.out.println("Data tidak ditemukan");
            }
        }
       
        loop = 1;
        while(loop == 1){
            System.out.print("Masukkan Tanggal Pinjam (1-31) :");
            int tglp = input.nextInt();
            System.out.print("Masukkan Bulan Pinjam (1-12) :");
            int blnp = input.nextInt();
            System.out.print("Masukkan Tahun Pinjam :");
            int thnp = input.nextInt();
            
            try{
                this.from = LocalDate.of(thnp,blnp,tglp);
                loop = 0;
            }catch(Exception e){
                System.out.println("Tanggal anda salah!");
                loop = 1;
            }
        }
        
        loop = 1;
        while(loop == 1){
            while(loop == 1){
                System.out.print("Masukkan Tanggal Kembali (1-31) :");
                int tglk = input.nextInt();
                System.out.print("Masukkan Bulan Kembali (1-12) :");
                int blnk = input.nextInt();
                System.out.print("Masukkan Tahun Kembali :");
                int thnk = input.nextInt();

                try{
                    this.to = LocalDate.of(thnk,blnk,tglk);
                    loop = 0;
                }catch(Exception e){
                    System.out.println("Tanggal anda salah!");
                    loop = 1;
                }
            }
            
            this.period = ChronoUnit.DAYS.between(this.from,this.to);
            if(this.period<0){
                System.out.println("Masukkan tanggal setelah tanggal pinjam!");
                loop = 1;
            }else if(this.period == 0){
                System.out.println("Minimal rental 1 hari!");
                loop = 1;
            }else{
                loop = 0;
            }
        }
    }
   
    void outputData(){
        String[] xsplit = this.datax.split(",");
        
        System.out.println("\nID Member       : "+xsplit[0]);
        System.out.println("Nama Member     : "+xsplit[1]);
        System.out.println("Jenis Member    : "+xsplit[2]+"\n");
        System.out.println("Tanggal Pinjam  : "+this.from);
        System.out.println("Tanggal Kembali : "+this.to);
        System.out.println("Lama Pinjam     : "+this.period);
        
        switch(xsplit[2]){
            case "Silver":
                Silver s = new Silver();
                s.output(this.period);
                break;
            case "Gold":
                Gold g = new Gold();
                g.output(this.period);
                break;
            case "Platinum":
                Platinum p = new Platinum();
                p.output(this.period);
                break;
           
        }
    }
   
}
