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
public class Tabung {
    public int jari;
    public int tinggi;
    
    public void hitungVol(){
        double hasil = (3.14 * jari * jari) * tinggi;
        System.out.println("Luas : "+hasil);
    }
    
    public void hitungLS(){
        double hasil = (2 * (3.14 * jari * jari)) + (2 * 3.14 * jari * tinggi) + (2 * 3.14 * jari * (jari + tinggi));
        System.out.println("Keliling : "+hasil);
    } 
}
