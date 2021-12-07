/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author lenovo
 */
public class PersegiPanjang extends BangunDatar {
    public double p,l;

    public double hitungLuas(){
        double luas = this.p * this.l;
        return luas;
    }
    
    public double hitungKeliling(){
        double keliling = 2 * (this.p + this.l) ;
        return keliling;
    }
}
