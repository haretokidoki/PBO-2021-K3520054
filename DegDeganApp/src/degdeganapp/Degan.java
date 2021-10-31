/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdeganapp;

/**
 *
 * @author lenovo
 */
public class Degan {
    
    int harga;
    double berats;
    
    Degan(){
        this.harga = 8000;
        this.berats = 1.2;
    }
    
    int hargaTotal(int jumlah){
        int total = jumlah * this.harga;
        return total;
    }
    
    double hargaTotal(double jumlah){
        double total = jumlah * this.harga;
        return total;
    }
    
    double beratTotal(int jumlah){
        double total = jumlah * this.berats;
        return total;
    }
    
    double beratTotal(double jumlah){
        double total = jumlah * this.berats;
        return total;
    }
}
