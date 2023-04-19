/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros_alfredo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Ejer1 {

    public static Scanner sc = new Scanner(System.in);

    public static void Ejer1() throws FileNotFoundException, IOException {
        String directorio;
       
        
        boolean salir = false;
        do {
            
            /*String ruta= "Resources/Menu/Data/Entities";
            ruta.replaceAll("/", "///"); Los strings son inmutables, ningún metodo cambia su estado, solo puede interpretarlo de x manera*/
            
            
            System.out.println("POR FAVOR. INTRODUZCA NOMBRE DEL FICHERO \n Escriba holamundo para el fichero holamundo.txt \n Escriba SALIR para salir al menu principal"
                    + "\n si no escribe nada, se abrirá el fichero de prueba en su defecto");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("salir")) {
                salir = true;
                break;
            }

             if (respuesta.isEmpty()) {                  // No introduce archivo...
                respuesta = "prueba";        // ... lo hacemos con uno por defecto.
                }
               
            try {
                    BufferedReader reader = new BufferedReader(new FileReader(respuesta + ".txt"));
                    String linea = reader.readLine();
                    while (linea != null) {
                        
                        System.out.println(linea);
                        linea = reader.readLine();
                    }
                    reader.close();
                } catch (IOException e) {
                    System.err.println("Error al leer el archivo: " + e.getMessage());
                } 
           

            

        } while (salir != true);
    }

}
