/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

import java.lang.Math;

/**
 *
 * @author lenovo
 */
public class Segitiga {
    
    double hitungLuas(int a, int t){
        return(0.5*a*t);
    }
    
    double hitungLuas(double a, double t){
        return(0.5*a*t);
    }
    
    double hitungKeliling(int a, int t){
        double m = Math.sqrt((a*a) + (t*t));
        return(m+a+m);
    }
    
    double hitungKeliling(double a, double t){
        double m = Math.sqrt((a*a) + (t*t));
        return(m+m+a);
    }
    
    
}
