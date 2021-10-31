/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author lenovo
 */
public class Segitiga {
    
    double findTriple(int a, int b, int c){
        double x = Math.pow(a, 2) + Math.pow(b, 2);
        if(Math.pow(c,2) == x){
            System.out.println("Segitiga abc MERUPAKAN segitiga dengan triple pythagoras \n");
            return 1;
        }else{
            System.out.println("Segitiga abc BUKAN MERUPAKAN segitiga dengan triple pythagoras \n");
            return 0;
        }
    }
    
    double findTriple(double a, double b, double c){
        double x = Math.pow(a, 2) + Math.pow(b, 2);
        if(Math.pow(c,2) == x){
            System.out.println("Segitiga abc MERUPAKAN segitiga dengan triple pythagoras");
            return 1;
        }else{
            System.out.println("Segitiga abc BUKAN MERUPAKAN segitiga dengan triple pythagoras");
            return 0;
        }
    }
    
    double findMiring(int a, int b){
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        return c;
    }
    
    double findMiring(double a, double b){
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b, 2));
        return c;
    }
    
    double findSiku(int a, int c){
        double b = Math.sqrt(Math.pow(c,2) - Math.pow(a, 2));
        return b;
    }
    
    double findSiku(double a, double c){
        double b = Math.sqrt(Math.pow(c,2) - Math.pow(a, 2));
        return b;
    }
}
