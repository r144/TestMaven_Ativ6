/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mediana;

/**
 *
 * @author renat
 */
public class Mediana {
    public double getMediana(double[] v){
        if(v.length %2 != 1){
            return v[v.length/2];
        }
        return (v[v.length / 2] + v[v.length/2+1])/2;
    }
    
}
