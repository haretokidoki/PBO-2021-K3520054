/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuaspegawai;
import datapegawai.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ProsesData a = new ProsesData();
        Tambah t = new Tambah();
        Validasi v = new Validasi();
        boolean loop = true;
        Scanner input = new Scanner(System.in);
        
        //Dummy
        //a.tambah(new DataPegawai("K0120053", "Paijo Telo", "Joglo","A", 20, 0, 0));
        //a.tambah(new DataPegawai("K0259011", "Ipan Setiawan", "Gilingan","B", 34, 1, 2));
        //a.tambah(new DataPegawai("K0391558", "Joko Setiono", "Malang","C", 31, 1, 1));
        
        while(loop == true){   
            System.out.println();
            System.out.println("====================================== Menu Utama ======================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Hapus Data");
            System.out.println("3. Cari Data");
            System.out.println("4. Lihat Data");
            System.out.println("5. Keluar");
            System.out.println();
            System.out.print("Menu pilihan: ");
            String m = input.nextLine();
            switch(m){
                case "1" :
                    // variabel loop 1
                    boolean x = true;
                    while(x == true){
                        a.tambah(t.action());
                        System.out.println();
                        System.out.println("Data berhasil disimpan!");
                        System.out.println();
                        x = v.validateLoop("Tambah");
                    }
                    // variabel loop utama
                    loop = true;
                    break;
                case "2":
                    boolean x1 = true;
                    while(x1 == true){
                        System.out.println();
                        System.out.println("=================== Hapus Karyawan ================");
                        System.out.print("Masukkan Kode Karyawan : ");
                        String i = input.nextLine();
                        a.hapus(i);
                        System.out.println();
                        x1 = v.validateLoop("Hapus");
                    }
                    break;
                case "3":
                    boolean x2 = true;
                    while(x2 == true){
                        System.out.println();
                        System.out.println("=================== Cari Karyawan ================");
                        System.out.print("Masukkan Kode Karyawan : ");
                        String h = input.nextLine();
                        a.cari(h);
                        System.out.println();
                        x2 = v.validateLoop("Cari");
                    }
                    break;
                case "4":
                    System.out.println();
                    a.tampil();
                    System.out.println();
                    v.validateStLoop();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default :
                    loop = true;
                    break;
            }
            
        }
        
    }
    
}
