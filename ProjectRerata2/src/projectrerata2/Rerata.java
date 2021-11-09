/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Rerata {
    
    //Array list data
    ArrayList<Integer> dataBil = new ArrayList<Integer>();
    
    void input(){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.print("Masukkan bil bulat: ");
            this.dataBil.add(input.nextInt());
            System.out.println("Isi data list: "+this.dataBil);
            input.nextLine();
            System.out.print("Input lagi? (y/n): ");
            char ans = input.nextLine().charAt(0);
            if(ans == 'n'){
                break;
            }
        }
    }
    
    double hitungRerata(ArrayList<Integer> data){
        double sum = 0;
        for(Integer item: data){
            sum += item;
        }
        double rerata = sum / data.size();
        return rerata;
    }
    
    void output(){
        System.out.println("====================");
        System.out.println("Rerata Data: " + this.hitungRerata(this.dataBil));
        System.out.println("Banyak Data: " + this.dataBil.size());
        System.out.println("Data Maks: " + Collections.max(this.dataBil));
        System.out.println("Data Min: " + Collections.min(this.dataBil));
    }
    
}
