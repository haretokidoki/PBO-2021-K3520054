/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

/**
 *
 * @author lenovo
 */
public abstract class Mobil {
    public abstract double hitungBensin();
    public abstract double hitungWaktu();
    
    public void tampilHasil(){
        System.out.println("Bahan bakar minimum yang diperlukan : "+this.hitungBensin()+" liter");
        System.out.println("Waktu yang diperlukan : "+this.hitungWaktu()+" jam");
    }
    
}
