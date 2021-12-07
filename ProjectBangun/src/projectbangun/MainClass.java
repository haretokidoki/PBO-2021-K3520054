/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangun;

import bangundatar.*;
import bangunruang.*;


/**
 *
 * @author lenovo
 */
public class MainClass {
    public static void main(String[] args) {
        Persegi p = new Persegi();
        Lingkaran l = new Lingkaran();
        PersegiPanjang pp = new PersegiPanjang();
        
        Balok b = new Balok();
        Tabung t = new Tabung();
        Bola bb = new Bola();
        
        // Persegi
        System.out.println("Persegi dengan sisi 6");
        p.sisi = 6;
        p.hitungLuas();
        p.hitungKeliling();
        p.tampilHasil();
        System.out.println();
        
        // Persegi Panjang
        System.out.println("Persegi panjang dengan panjang 8 dan lebar 6");
        pp.p = 8;
        pp.l = 6;
        pp.hitungLuas();
        pp.hitungKeliling();
        pp.tampilHasil();
        System.out.println();
        
        // Lingkaran
        System.out.println("Lingkaran dengan jari-jari 7");
        l.r = 7;
        l.hitungLuas();
        l.hitungKeliling();
        l.tampilHasil();
        System.out.println();
        
        // Balok
        System.out.println("Balok dengan panjang 8, lebar 6 dan tinggi 10");
        b.p = 8;
        b.l = 6;
        b.t = 10;
        b.hitungVolume();
        b.hitungLP();
        b.tampilHasil();
        System.out.println();
        
        // Tabung
        System.out.println("Tabung dengan jari jari 14 dan tinggi 20");
        t.r = 14;
        t.t = 20;
        t.hitungVolume();
        t.hitungLP();
        t.tampilHasil();
        System.out.println();
        
        // Tabung
        System.out.println("Bola dengan jari jari 10 ");
        bb.r = 10;
        bb.hitungVolume();
        bb.hitungLP();
        bb.tampilHasil();
        System.out.println();
    }
}
