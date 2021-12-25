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
public class DataPegawai {
    public String kode;
    private String nama, alamat, gol, stnikah;
    private int nikah, anak, usia;
    Gaji a;

    public DataPegawai(String kode, String nama, String alamat, String gol,int usia, int nikah, int anak) {
        this.kode = kode;
        this.nama = nama;
        this.alamat = alamat;
        this.gol = gol;
        this.nikah = nikah;
        this.anak = anak;
        this.usia = usia;
        a = new Gaji(gol);
        if(this.nikah == 1){
            this.stnikah = "Sudah Menikah";
        }else{
            this.stnikah = "Belum Menikah";
        }
    }
    
    public void printTable(){
        if(this.nikah == 1){
            stnikah = "Sudah Menikah";
        }else{
            stnikah = "Belum Menikah";
        }
        System.out.println(this.kode+"         "+this.nama+"       "+this.gol+"     "+this.usia+"     "+this.stnikah+"              "+this.anak);
    }
    
    public void printInfo(){
        a.hitungGaji(this.anak, this.usia, this.nikah);
        System.out.println();
        System.out.println("================== Data Karyawan ==================");
        System.out.println("Kode Karyawan : "+this.kode);
        System.out.println("Nama Karyawan : "+this.nama);
        System.out.println("Golongan : "+this.gol);
        System.out.println("Usia : "+this.usia);
        System.out.println("Status Menikah : "+this.stnikah);
        System.out.println("Jumlah Anak : "+this.anak);
        System.out.println("-----------------------------------");
        System.out.println("Gaji Pokok : "+this.a.getGapok());
        System.out.println("Tunjangan Nikah : "+this.a.getNikah());
        System.out.println("Tunjangan Pegawai : "+this.a.getPegawai());
        System.out.println("Tunjangan Anak : "+this.a.getAnak());
        System.out.println("----------------------------------------------- +");
        System.out.println("Gaji Kotor : "+this.a.getGator());
        System.out.println("Potongan : "+this.a.getPtg());
    }
}
