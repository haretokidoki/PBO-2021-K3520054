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
public class BangunRuangMain {
    public static void main(String[] args){
        Bola bola = new Bola();
        bola.jari = 10;
        System.out.println("Bola");
        System.out.println("Jari-jari : " + bola.jari);
        bola.hitungVol();
        bola.hitungLS();
        System.out.println("\n");
        
        Tabung tbg = new Tabung();
        tbg.jari = 10;
        tbg.tinggi = 8; 
        System.out.println("Tabung");
        System.out.println("Jari-jari : " + tbg.jari + " Tinggi tabung : "+tbg.tinggi);
        tbg.hitungVol();
        tbg.hitungLS();
        System.out.println("\n");
        
        Kerucut krc = new Kerucut();
        krc.jari = 3;
        krc.tinggi = 4;
        krc.pelukis = 5;
        System.out.println("Kerucut");
        System.out.println("Jari-jari : " + krc.jari + " Tinggi kerucut : "+ krc.tinggi + " Garis Pelukis : "+krc.pelukis);
        krc.hitungVol();
        krc.hitungLS();
        System.out.println("\n");
    }
}
