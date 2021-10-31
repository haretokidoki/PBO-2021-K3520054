/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;
import java.util.Scanner;
import java.util.Random;

public class GameTebakAngkaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rando = new Random();
        Scanner input = new Scanner(System.in);
        int x = rando.nextInt(101);
        int y;
        boolean loop = true;
        
        System.out.println("Hai.. nama saya Mr. Java, saya telah memilih sebuah "
                + "bilangan bulat secara acak antara 0 s/d 100. "
                + "Silakan tebak ya!!!”");
        
        while (loop == true){
            System.out.print("Masukkan tebakan anda : ");
            y = input.nextInt();
            
            if(y > x){
                System.out.println("Hehehe.... Bilangan anda terlalu besar");
            }else if(y < x){
                System.out.println("Hehehe.... Bilangan anda terlalu kecil");
            }else if(y == x){
                System.out.println("Yeee... tebakan anda BENAR!");
                loop = false;
            }
        }
    }
    
}
