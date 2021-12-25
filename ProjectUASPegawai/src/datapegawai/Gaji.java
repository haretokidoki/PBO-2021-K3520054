/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datapegawai;

/**
 *
 * @author lenovo
 */
public class Gaji {
    private int gapok;
    private double tunjnikah, tunjanak, tunjpeg, total, potongan, gaber;
    
    public Gaji(String gol) {
        switch(gol){
            case "A":
                this.gapok = 5000000;
                break;
            case "B":
                this.gapok = 6000000;
                break;
            case "C" :
                this.gapok = 7000000;
                break;
        }
    }
    
    public void hitungGaji(int anak, int umur, int nikah){
        // tunjangan nikah
        if(nikah == 1){
            this.tunjnikah = gapok*0.1;
        }else{
            this.tunjnikah = 0;
        }
        // tunjangan pegawai
        if(umur > 30){
            this.tunjpeg = gapok*0.15;
        }else{
            this.tunjpeg = 0;
        }
        // tunjangan anak
        this.tunjanak = anak*(gapok*0.05);
        // total
        this.total = this.gapok+ this.tunjnikah + this.tunjanak + this.tunjpeg;
        this.potongan = total*0.025;
        this.gaber = this.total-this.potongan;
    }
    
    public double getNikah(){
        return this.tunjnikah;
    }
    
    public double getPegawai(){
        return this.tunjpeg;
    }
    
    public double getAnak(){
        return this.tunjanak;
    }
    
    public int getGapok(){
        return this.gapok;
    }
    
    public double getPtg(){
        return this.potongan;
    }
    
    public double getGator(){
        return this.total;
    }

    
}
