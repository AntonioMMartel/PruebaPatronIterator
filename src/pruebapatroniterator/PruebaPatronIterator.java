/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebapatroniterator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
/**
 * @author Antonio Miguel Martel
 */
public class PruebaPatronIterator {


    public static void main(String[] args) {
        try {
            String fileName = "hola.txt";
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            
            IteratorReader iterador = new IteratorReader(reader);
            for (String lineaString : iterador) {
                System.out.println(lineaString);
            }
            
        } catch (FileNotFoundException exception) {
            System.out.println("Error: no se ha encontrado el archivo");
        }
    }
}
