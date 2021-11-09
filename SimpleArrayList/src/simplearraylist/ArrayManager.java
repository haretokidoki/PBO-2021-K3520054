/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplearraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ArrayManager {
 
    ArrayList<String> dataBil = new ArrayList<String>();
    String x;
    int index;
    Scanner input = new Scanner(System.in);
    boolean loop = true;
    
    void input(){
        while(loop == true){
            System.out.println("Menu Data Arraylist");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Data");
            System.out.println("3. Hapus Data");
            System.out.println("4. Tampil Data");
            System.out.println("5. Keluar");
            System.out.print("Masukkan nomor menu : ");
            String menu = input.nextLine();
            switch(menu){
                case "1":
                    System.out.print("Masukkan data string: ");
                    this.dataBil.add(input.nextLine());
                    System.out.println("Daftar string dalam array list: "+this.dataBil);
                    System.out.println("---------------------------------");
                    break;
                case "2":
                    System.out.print("Masukkan data string: ");
                    x = input.nextLine();
                    index = dataBil.indexOf(x);
                    if(index == -1){
                        System.out.println("Data "+x+" tidak ditemukan!");
                    }else{
                        System.out.println("Data "+x+" berada di index "+index);
                    }
                    System.out.println("---------------------------------");
                    break;
                case "3":
                    System.out.print("Masukkan data string: ");
                    x = input.nextLine();
                    index = dataBil.indexOf(x);
                    if(index == -1){
                        System.out.println("Data "+x+" tidak ditemukan!");
                    }else{
                        this.dataBil.remove(index);
                        System.out.println("Data "+x+" berhasil dihapus");
                    }
                    System.out.println("Daftar string dalam array list: "+this.dataBil);
                    System.out.println("---------------------------------");
                    break;
                case "4":
                    System.out.println("Daftar string dalam array list: "+this.dataBil);
                    System.out.println("---------------------------------");
                    break;
                case "5":
                    loop = false;
                    break;
            }
        }
    }
   
    
}
