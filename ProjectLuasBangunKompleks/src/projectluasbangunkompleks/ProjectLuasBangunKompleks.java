/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author lenovo
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variabel bangun 1
        int sisi1 = 42;
        
        //variabel bangun 2
        int sisi2a = 28;
        int sisi2b = 14;
   
        Persegi p = new Persegi();     
        Lingkaran l = new Lingkaran();
        
        //hitung bangun 1
        double totalLuas1 = p.hitungLuas(sisi1) + (l.hitungLuas(sisi1)*2);
        System.out.println("Luas Bangun Pertama : "+totalLuas1+" cm2");
        
        //hitung bangun 2
        double totalLuas2 = (l.hitungLuas(sisi2a)*0.5) - (l.hitungLuas(sisi2b));
        System.out.println("Luas Bangun Kedua : "+totalLuas2+" cm2");
    }
    
}
