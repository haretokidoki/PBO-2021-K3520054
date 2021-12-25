/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectuaspegawai;

import datapegawai.DataPegawai;
import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class ProsesData {
    private ArrayList<DataPegawai> datap = new ArrayList<DataPegawai>();
    
    protected void tambah(DataPegawai data){
        this.datap.add(data);
    }
    
    protected void hapus(String kode){
        this.datap.removeIf(item -> item.kode.equals(kode));
    }
    
    protected void cari(String kode){
        boolean found = false;
        int index = -1;
        for(int i=0; i<this.datap.size(); i++){
            if (this.datap.get(i).kode.equals(kode)){
                index = i;
                found = true;
            }
        }
        
        if (found == true){
            System.out.println();
            this.datap.get(index).printInfo();
        } else {
            System.out.println();
            System.out.println("Data karyawan tidak ditemukan");
            System.out.println();
        }
    }
    
    protected void tampil(){
        System.out.println("===================================");
        System.out.println("DATA KARYAWAN");
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println("KODE KARY	 NAMA KARY	  GOL	  USIA	   STATUS NIKAH		  JUMLAH ANAK");
        System.out.println("-------------------------------------------------------------------------------------");
        for(DataPegawai item: this.datap){
            item.printTable();
        }
    }
}
