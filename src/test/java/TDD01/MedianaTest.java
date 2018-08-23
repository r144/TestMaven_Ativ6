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
public class MedianaTest {

    public MedianaTest() {
    }

    @Test
    public void testeVetorOrdenadoImpar() {
        double[] vector = {1, 2, 3, 4, 5};
        
        Mediana m = new Mediana();
        
        double res = m.getMediana(vector);
        assertEquals(res, 3, 0.01);
    }
}
