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
public class CalcEstatistica {

    public double getMediana(double[] v) {
        int meio = v.length / 2;
        if (v.length % 2 == 1) {
            return v[meio];
        } else {
            return (v[meio] + v[meio - 1]) / 2;
        }
    }
}