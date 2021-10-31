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
public class Delivery {
    int biaya;
    int bm;
    
    Delivery(){
        this.biaya = 700000;
        this.bm = 3000;
    }
    
    double totalCost(int jumlah, int jarak){
        
        // hitung biaya ongkir per 5km ke tujuan
        double ongkir = this.biaya * (jarak/5);
        
        Degan degan = new Degan();
        double berat = degan.beratTotal(jumlah);
        
        // hitung truk diperlukan
        double carter = Math.ceil(berat / this.bm);
        
        
        
        // hitung biaya total
        double total = ongkir * carter;
        return total;
    }
    
}
