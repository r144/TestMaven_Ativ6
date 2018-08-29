/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TDD01;

import org.junit.Test;
import static org.junit.Assert.*;
import Mediana.*;

/**
 *
 * @author renat
 */
public class EstatisticaTest {

    public EstatisticaTest() {
    }

    @Test
    public void testeVetorOrdenadoImpar() {
        double[] vector = {1, 2, 3, 4, 5};
        
        CalcEstatistica calcula = new CalcEstatistica();
        
        
        double res = calcula.getMediana(vector);
        assertEquals(res, 3, 0.01);
    }
    
    @Test
    public void testeVetorOrdenadoPar() {
        double[] vector = {1, 2, 3, 5, 5, 6};
        
        CalcEstatistica calcula = new CalcEstatistica();
        
        double res = calcula.getMediana(vector);
        assertEquals(res, 4, 0.01);
                
    }
    
    @Test
    public void testeMedia() {
        double[] vector = {1, 2, 3, 6};

        CalcEstatistica calcula = new CalcEstatistica();

        double res = calcula.getMedia(vector);
        assertEquals(res, 3, 0.01); 
    }
}
