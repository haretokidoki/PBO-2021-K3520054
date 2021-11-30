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
public class Platinum extends Gold {
    
    private double pulsa;
    
    public Platinum(){
        super.poin = 10;
        super.diskon = 3;
        super.cost = 45000;
        super.cashback = 10000;
        this.pulsa = 5000;
    }
    
    double bonus(long lama){
        double bonus = this.pulsa * lama;
        return bonus;
    }
    
    @Override
    void output(long lama){
        double sewa = this.rent(this.cost, lama, this.diskon);
        double poins = this.points(this.poin, lama);
        System.out.println("Total Sewa      : "+sewa);
        System.out.println("Jumlah Poin     : "+poins);
        System.out.println("Jumlah Cashback : "+this.cashback);
        System.out.println("Bonus Pulsa     : "+this.bonus(lama));
    }
}
