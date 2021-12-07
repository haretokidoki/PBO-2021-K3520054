/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbensinmobil;

import mobil.*;

/**
 *
 * @author lenovo
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sedan A = new Sedan();
        Sedan B = new Sedan();
        SUV C = new SUV();
        SUV D = new SUV();
        MPV E = new MPV();
        MPV F = new MPV();
        
        
        System.out.println("----------------------------------");
        System.out.println("Mobil A \nTipe : Sedan \nRute : Solo-Kudus \nJarak : 107km \nKecepatan : 60km/jam");
        A.length = 107;
        A.spd = 60;
        A.hitungBensin();
        A.hitungWaktu();
        A.tampilHasil();
        System.out.println("----------------------------------");
        System.out.println("Mobil B \nTipe : Sedan \nRute : Solo-Jakarta \nJarak : 538km \nKecepatan : 65km/jam");
        B.length = 538;
        B.spd = 65;
        B.hitungBensin();
        B.hitungWaktu();
        B.tampilHasil();
        System.out.println("----------------------------------");
        System.out.println("Mobil C \nTipe : SUV \nRute : Solo-Banten \nJarak : 663km \nKecepatan : 57km/jam");
        C.length = 663;
        C.spd = 57;
        C.hitungBensin();
        C.hitungWaktu();
        C.tampilHasil();
        System.out.println("----------------------------------");
        System.out.println("Mobil D \nTipe : SUV \nRute : Solo-Bandung \nJarak : 535km \nKecepatan : 62km/jam");
        D.length = 535;
        D.spd = 62;
        D.hitungBensin();
        D.hitungWaktu();
        D.tampilHasil();
        System.out.println("----------------------------------");
        System.out.println("Mobil E \nTipe : MPV \nRute : Solo-Banyuwangi \nJarak : 109km \nKecepatan : 64km/jam");
        E.length = 109;
        E.spd = 64;
        E.hitungBensin();
        E.hitungWaktu();
        E.tampilHasil();
        System.out.println("----------------------------------");
        System.out.println("Mobil F \nTipe : MPV \nRute : Solo-Jember \nJarak : 427km \nKecepatan : 53km/jam");
        F.length = 427;
        F.spd = 53;
        F.hitungBensin();
        F.hitungWaktu();
        F.tampilHasil();
        System.out.println("----------------------------------");
        
    }
    
    
}
