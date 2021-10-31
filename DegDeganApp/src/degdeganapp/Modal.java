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
public class Modal {
    
    int harga;
    double ongkir;
    
    double hitungModal(int jumlah, int jarak){
        Degan degan = new Degan();
        Delivery deliv = new Delivery();
        this.harga = degan.hargaTotal(jumlah);
        this.ongkir = deliv.totalCost(jumlah, jarak);
        double total = this.harga + this.ongkir;
        
        System.out.println("Total biaya borong : "+this.harga);
        System.out.println("Total biaya ongkir : "+this.ongkir);
        System.out.println("Total biaya habis : "+total);
        System.out.println();
        
        return total;
    }
    
    
}
