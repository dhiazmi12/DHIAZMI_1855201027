/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Dhiazmi <dhiazmie@gmail.com>
 */
public class TxtFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        //READ TXT FILE
    String fileName = "D://input.txt";//path
    String baris = null;
       
    // Adalah Class, // OBJEK
        FileReader fileReader
                = new FileReader(fileName);
        
        BufferedReader bufferedReader 
                = new BufferedReader(fileReader); {
        
        
        while ((baris = bufferedReader.readLine()) !=null) {
                System.out.println(baris);
                
                
            }
            bufferedReader.close();
        }
    }
    
}
