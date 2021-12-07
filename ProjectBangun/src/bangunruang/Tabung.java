/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author lenovo
 */
public class Tabung extends BangunRuang {
    public double r,t;
    
    public double hitungVolume(){
        double luas = Math.PI * this.r * this.r * this.t;
        return luas;
    }
    
    public double hitungLP(){
 	 double keliling = 2 * Math.PI * this.r * (this.r + this.t);
         return keliling;
    }
}
