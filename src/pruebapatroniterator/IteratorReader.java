/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebapatroniterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Antonio Miguel Martel
 */
public class IteratorReader implements Iterable<String>{
    private final BufferedReader bufferedReader;

    public IteratorReader(BufferedReader bufferedReader) {
        this.bufferedReader = bufferedReader;
    }
    
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            String linea = readLine();
            
            @Override
            public boolean hasNext() {
                    return linea != null;
            }

            @Override
            public String next() {
                String lineaResult = linea;
                linea = readLine();
                return lineaResult;
            }
            
            //Esto esta aqui porque si no especifico una linea al principio
            //Automaticamente el for que recorra mi iterador va a pensar
            // Que al principio tengo un nulo y no me lo va a recorrer
            private String readLine() {
                try {
                    return bufferedReader.readLine();
                } catch (IOException ex) {
                    System.out.println("Error");
                    return null;
                }
            }
        };
    }
    
    
    
}
