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
public class Kerucut {
    public int jari;
    public int tinggi;
    public int pelukis;
    
    public void hitungVol(){
        double hasil = 1.0 / 3.0 * 3.14 * jari * jari * tinggi;
        System.out.println("Volume : "+hasil);
    }
    
    public void hitungLS(){
        double hasil = 3.14 * jari * (jari + pelukis);
        System.out.println("Luas alas : "+hasil);
    } 
}
