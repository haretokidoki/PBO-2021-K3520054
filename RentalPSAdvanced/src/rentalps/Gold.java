/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalps;

/**
 *
 * @author lenovo
 */
public class Gold extends Silver {
    
    protected int cashback = 5000;
    
    public Gold(){
        super.poin = 5;
        super.diskon = 2;
        super.cost = 30000;
    }
    
    @Override
    void output(long lama){
        double sewa = this.rent(this.cost, lama, this.diskon);
        double poins = this.points(this.poin, lama);
        System.out.println("Total Sewa      : "+sewa);
        System.out.println("Jumlah Poin     : "+poins);
        System.out.println("Jumlah Cashback : "+this.cashback);
    }
}
