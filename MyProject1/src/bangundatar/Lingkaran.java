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
public class Lingkaran {
    public int jari;
    
    public void hitungLuas(){
       double hasil = 3.14 * jari * jari;
       System.out.println("Luas : "+hasil); 
    }
    
    public void hitungKeliling(){
        double hasil = jari * 4;
        System.out.println("Keliling : "+hasil);
    }    
}
