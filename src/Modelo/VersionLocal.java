/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class VersionLocal {
    
    public static String leerVersionLocal() {
        String version = "Error";
        try {
            File doc = new File("src/Version/Version.txt");
            Scanner obj = new Scanner(doc);

            while (obj.hasNextLine()) {
                version = obj.nextLine();
            }
            return version;
        } catch (Exception e) {
           e.printStackTrace();
        }
        return version;
    }
}
   
    
 
