/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuaspegawai;

import datapegawai.DataPegawai;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Tambah extends Validasi {
    Scanner input = new Scanner(System.in);
    
    public DataPegawai action(){
        ProsesData a = new ProsesData();
        System.out.println();
        System.out.println("==================== Tambah Karyawan =========================");
        System.out.print("Masukkan kode karyawan: ");
        String kode = input.nextLine();
        System.out.print("Masukkan nama karyawan: ");
        String nama = input.nextLine();
        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();
        
        // validasi tanggal
        boolean valt = true;
        String tl = "0";
        while(valt == true){
            System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
            tl = input.nextLine();
            valt = super.validateTgl(tl);
        }
        int umur = Period.between(LocalDate.parse(tl), LocalDate.now()).getYears();
        
        // validasi golongan
        boolean valg = true;
        String gol = "";
        while(valg == true){
            System.out.print("Masukkan golongan (A/B/C): ");
            gol = input.nextLine().toUpperCase();
            valg = super.validateGol(gol);
        }
        gol = gol;
        
        // validasi nikah
        boolean valn = true;
        int nikah = 0;
        while(valn == true){
            System.out.print("Masukkan status menikah (0:belum, 1:sudah): ");
            nikah = input.nextInt();
            input.nextLine();
            valn = super.validateNikah(nikah);
        }
        nikah = nikah;
        
        // input anak jika sudah menikah
        int anak;
        if(nikah == 1){
            System.out.print("Masukkan jumlah anak: ");
            anak = input.nextInt();
            input.nextLine();
        }else{
            anak = 0;
        }
        DataPegawai x = new DataPegawai(kode, nama, alamat,gol, umur, nikah, anak);
        return x;
    }
}
