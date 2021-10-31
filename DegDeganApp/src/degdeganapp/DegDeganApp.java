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
public class DegDeganApp {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Modal modal = new Modal();
        System.out.println("Boyolali");
        double m1 = modal.hitungModal(5000, 15);
        System.out.println("Salatiga");
        double m2 = modal.hitungModal(7500, 35);
        System.out.println("Klaten");
        double m3 = modal.hitungModal(8300, 30);
        System.out.println("Kudus");
        double m4 = modal.hitungModal(9100, 75);
        
        double mtotal = m1 + m2 + m3 + m4;
        double target = mtotal + 15000000;
        double jual = Math.ceil((target/29900));
        
        System.out.println("Total modal dipakai : Rp "+mtotal+"0");
        System.out.println("Harga satuan minimal yang harus dipatok adalah : Rp "+jual+"0");
         
    }
    
}
