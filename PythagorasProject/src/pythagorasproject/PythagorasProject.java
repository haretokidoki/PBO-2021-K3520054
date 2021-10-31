/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;
import java.util.Scanner;

public class PythagorasProject {

    public static void main(String[] args) {
        
        Segitiga s = new Segitiga();
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        int menu = 0;
        int a,b,c;
        double hasil;
        
        while(loop == true){
            System.out.print("Aplikasi Pythagoras \n "
                    + "1. Cek Triple Pythagoras \n "
                    + "2. Cari sisi miring \n "
                    + "3. Cari sisi siku-siku \n "
                    + "4. Keluar \n"
                    + "Pilih Menu : ");
            menu = input.nextInt();
            System.out.println();
            switch(menu){
                case 1:
                    System.out.print("Masukkan nilai A : ");
                    a = input.nextInt();
                    System.out.print("Masukkan nilai B : ");
                    b = input.nextInt();
                    System.out.print("Masukkan nilai C : ");
                    c = input.nextInt();                    
                    hasil = s.findTriple(a,b,c);
                    break;
                
                case 2:
                    System.out.print("Masukkan nilai A : ");
                    a = input.nextInt();
                    System.out.print("Masukkan nilai B : ");
                    b = input.nextInt();
                    hasil = s.findMiring(a,b);
                    System.out.println("Nilai sisi C adalah : "+hasil);
                    System.out.println();
                    break;
                    
                case 3:
                    System.out.print("Masukkan nilai A : ");
                    a = input.nextInt();
                    System.out.print("Masukkan nilai C : ");
                    c = input.nextInt();
                    hasil = s.findSiku(a,c);
                    System.out.println("Nilai sisi C adalah : "+hasil);
                    System.out.println();
                    break;
                    
                case 4:
                    loop = false;
                    break;
            }
        }
    }
    
}
