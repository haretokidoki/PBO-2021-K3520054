/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author lenovo
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persegi p = new Persegi();
        PersegiPanjang pp = new PersegiPanjang();
        Lingkaran l = new Lingkaran();
        Segitiga s = new Segitiga();
        
        //Persegi Panjang
        System.out.println("Persegi Panjang");
        System.out.println("Panjang: 10, Lebar: 5, Luas: "+pp.hitungLuas(10, 5)+", Keliling: "+pp.hitungKeliling(10, 5));
        System.out.println("Panjang: 4.6, Lebar: 8, Luas: "+pp.hitungLuas(3.6, 8)+", Keliling: "+pp.hitungKeliling(3.6, 8));
        System.out.println("Panjang: 6, Lebar: 8.3, Luas: "+pp.hitungLuas(6, 8.3)+", Keliling: "+pp.hitungKeliling(6, 8.3));
        System.out.println("Panjang: 5.6, Lebar: 8.6, Luas: "+pp.hitungLuas(5.6, 8.6)+", Keliling: "+pp.hitungKeliling(5.6, 8.6));
        System.out.println("");
        
         //Persegi
        System.out.println("Persegi");
        System.out.println("Sisi: 4.5, Luas: "+p.hitungLuas(4.5)+", Keliling: "+p.hitungKeliling(4.5));
        System.out.println("Sisi: 7, Luas: "+p.hitungLuas(7)+", Keliling: "+p.hitungKeliling(7));
        System.out.println("");
        
        //Lingkaran
        System.out.println("Lingkaran");
        System.out.println("Jejari: 5, Luas: "+l.hitungLuas(5)+", Keliling: "+l.hitungKeliling(5));
        System.out.println("Jejari: 7.4, Luas: "+l.hitungLuas(7.4)+", Keliling: "+l.hitungKeliling(7.4));
        System.out.println("");
        
        //Segitiga
        System.out.println("Segitiga");
        System.out.println("Panjang Alas: 7.4, Tinggi: 10 Luas: "+s.hitungLuas(7.4,10)+", Keliling: "+s.hitungKeliling(7.4,10));
        System.out.println("Panjang Alas: 8, Tinggi: 10 Luas: "+s.hitungLuas(8,10)+", Keliling: "+s.hitungKeliling(8,10));
        System.out.println("Panjang Alas: 8, Tinggi: 11.5 Luas: "+s.hitungLuas(8,11.5)+", Keliling: "+s.hitungKeliling(8,11.5));
        System.out.println("Panjang Alas: 12.2, Tinggi: 9 Luas: "+s.hitungLuas(12.2,9)+", Keliling: "+s.hitungKeliling(12.2,9));
        System.out.println("Panjang Alas: 13.9, Tinggi: 20.7 Luas: "+s.hitungLuas(13.9,20.7)+", Keliling: "+s.hitungKeliling(13.9,20.7));
        System.out.println("");
    }
    
}
