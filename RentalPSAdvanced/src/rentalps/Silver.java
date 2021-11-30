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
public class Silver {
    
    protected int lama;
    protected int cost;
    protected int poin;
    protected double diskon;
    
    public Silver(){
        this.cost = 25000;
        this.poin = 1;
        this.diskon = 1;
    }
    
    double rent(int cost, long lama, double diskon){
        double total = (cost*lama)-(cost*lama*diskon/100);
        return total;
    }
    
    double points(int poin, long lama){
        double total = poin*lama;
        return total;
    }
    
    void output(long lama){
        double sewa = this.rent(this.cost, lama, this.diskon);
        double poins = this.points(this.poin, lama);
        System.out.println("Total Sewa : "+sewa);
        System.out.println("Total Poin : "+poins);
    }
}
