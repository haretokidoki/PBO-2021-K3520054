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
public class Validasi {
    Scanner input = new Scanner(System.in);
    
    protected boolean validateLoop(String action){
        boolean y = true;
        boolean x = true;
        while(y == true){
            System.out.println("Pilih SubMenu:");
            System.out.println("1. Kembali ke menu utama");
            System.out.println("2. "+action+" Data Kembali");
            System.out.print("\nMenu pilihan: ");
            String menu = input.nextLine();
            if(menu.equals("1")){
                y = false;
                x = false;
            }else if(menu.equals("2")){
                y = false;
                x = true;
            }else{
                System.out.println("\nMasukan anda salah!\n");
                y = true;
            }
        }
        return x;
    }
    
    protected void validateStLoop(){
        boolean y = true;
        while(y == true){
            System.out.println();
            System.out.println("Pilih SubMenu:");
            System.out.println("1. Kembali ke menu utama");
            System.out.print("\nMenu pilihan: ");
            String menu = input.nextLine();
            if(menu.equals("1")){
                y = false;
            }else{
                System.out.println("\nMasukan anda salah!");
                y = true;
            }
        }
    }
    
    protected boolean validateTgl(String tl){
        try{
            Period.between(LocalDate.parse(tl), LocalDate.now()).getYears();
            return false;
        }catch(Exception e){
            System.out.println("Inputan salah!");
            return true;
        }  
    }
    
    protected boolean validateGol(String gol){
        if(gol.equals("A")){
            return false;
        }else if(gol.equals("B")){
            return false;
        }else if(gol.equals("C")){
            return false;
        }else{
            System.out.println("Inputan salah! (Masukkan A/B/C)");
            return true;
        }
    }
    
    protected boolean validateNikah(int nikah){
        if(nikah == 0){
            return false;
        }else if(nikah == 1){
            return false;
        }else{
            System.out.println("Inputan salah! (Masukkan 0/1)");
            return true;
        }
    }
    
}
