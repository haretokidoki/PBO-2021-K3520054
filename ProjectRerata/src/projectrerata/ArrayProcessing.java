/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrerata;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class ArrayProcessing {
    //array of integer -> data
    int[] dataBil= new int[100];
    
    //jumlah data
    int n;
    
    void input(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan banyak data (n): ");
        this.n = input.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("Masukkan bil ke-"+(i+1)+" : ");
            this.dataBil[i] = input.nextInt();
        }
    }
    
    double hitungRerata(int[] data){
        double sum = 0;
        for(int i=0; i<this.n; i++){
            sum += data[i];
        }
        double rerata = sum/this.n;
        return rerata;
    }
    
    int cariMax(int[] data){
        int max = data[0];
        for(int i=1; i<this.n; i++){
            if(data[i] > max){
                max = data[i];
            }
        }
        return max;
    }
    
    int cariMin(int[] data){
        int min = data[0];
        for(int i=1; i<this.n; i++){
            if(data[i] < min){
                min = data[i];
            }
        }
        return min;
    }
    
    int[] urutkan(int[] data){
        int[] urut = new int[this.n];
        for(int i = 0; i<this.n-1; i++){
            for(int j = 0; j<this.n-i-1; j++){
                if (data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        
        for(int k = 0; k<this.n; k++){
            urut[k] = data[k];
        }
        
        return urut;
    }
    
    void output(){
        System.out.println("Rerata: "+this.hitungRerata(this.dataBil));
        System.out.println("Nilai Maksimum: "+this.cariMax(this.dataBil));
        System.out.println("Nilai Minimum: "+this.cariMin(this.dataBil));
        System.out.println("Urutan: "+Arrays.toString(this.urutkan(this.dataBil)));
    }
    
}
