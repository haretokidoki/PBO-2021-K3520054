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
public class Bola extends BangunRuang {
    public double r;
    
    
    public double hitungVolume(){
        double luas = 4/3 * Math.PI * this.r * this.r * this.r;
        return luas;
    }
    
    
    public double hitungLP(){
 	 double keliling = 4 * Math.PI * this.r * this.r;
         return keliling;
    }
}
