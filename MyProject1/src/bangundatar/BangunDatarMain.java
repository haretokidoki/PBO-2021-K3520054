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
public class BangunDatarMain {
    public static void main(String[] args){
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 25;
        pp1.lebar = 38;
        System.out.println("Persegi panjang");
        System.out.println("panjang : " + pp1.panjang + " lebar : " + pp1.lebar );
        pp1.hitungLuas();
        pp1.hitungKeliling();
        System.out.println("\n");
        
        Persegi prsa = new Persegi();
        prsa.sisi = 10;
        System.out.println("Persegi A");
        System.out.println("sisi : " + prsa.sisi);
        prsa.hitungLuas();
        prsa.hitungKeliling();
        System.out.println("\n");
        
        Persegi prsb = new Persegi();
        prsb.sisi = 15;
        System.out.println("Persegi B");
        System.out.println("sisi : " + prsb.sisi);
        prsb.hitungLuas();
        prsb.hitungKeliling();
        System.out.println("\n");
        
        Lingkaran lkrx = new Lingkaran();
        lkrx.jari = 25;
        System.out.println("Lingkaran X");
        System.out.println("jari-jari : "+lkrx.jari);
        lkrx.hitungLuas();
        lkrx.hitungKeliling();
        System.out.println("\n");
        
        Lingkaran lkrz = new Lingkaran();
        lkrz.jari = 37;
        System.out.println("Lingkaran Z");
        System.out.println("jari-jari : "+lkrz.jari);
        lkrz.hitungLuas();
        lkrz.hitungKeliling();
        System.out.println("\n");
    }
}
