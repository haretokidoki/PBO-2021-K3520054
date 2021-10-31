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
public class Bola {
    public int jari;
    
    public void hitungVol(){
        double hasil = 4 / 3 * 3.14 * jari * jari * jari;
        System.out.println("Luas : "+hasil);
    }
    
    public void hitungLS(){
        double hasil = 4 * 3.14 * jari * jari;
        System.out.println("Keliling : "+hasil);
    } 
}
