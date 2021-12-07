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
public class Sedan extends Mobil{
    public double length, spd;
    
    public double hitungBensin(){
        double bensin = this.length / 10;
        return bensin;
    }
    
    public double hitungWaktu(){
        double waktu = this.length / this.spd;
        return waktu;
    }
}
