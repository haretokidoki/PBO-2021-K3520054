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
public class Balok extends BangunRuang {
    public double p,l,t;
    
    public double hitungVolume(){
        double volume = this.p*this.l*this.t;
        return volume;
    }
    
    public double hitungLP(){
        double lp = 2*(this.p*this.l + this.p*this.t + this.l*this.t);
        return lp;
    }
}
