/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros_alfredo;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ejer3 {

    public static void Ejer3(String fichero) throws FileNotFoundException, IOException {

     
       
        BufferedReader reader = new BufferedReader(new FileReader(fichero + ".xml"));
        // Cremos el archivo de salida
        File archivoSalida = new File("max_min_26089.txt");
        FileWriter fw = new FileWriter(archivoSalida);
        BufferedWriter bw = new BufferedWriter(fw);
        
        // Escribimos encabezado 
        bw.write("DIA\tMAXIMA[ºC]\tMINIMA[ºC]");
        bw.newLine();
        bw.flush();

        String linea = reader.readLine();
        
        System.out.println("DIA\t" + "MAXIMAT" + "[º]\t" + "MINIMA[º]");
        while (linea != null) {

            while (linea != null && !linea.contains("dia fecha")) {
                linea = reader.readLine();
                

            }
            if (linea != null) { // Comprobamos que línea no es nula
                String dia = linea.substring(linea.length() - 4, linea.length() - 2) + "\t";
                System.out.print(dia);

                while (linea != null && !linea.contains("maxima")) {
                    linea = reader.readLine();
                }

                if (linea != null) { // Comprobamos que línea no es nula
                    int Inicio = linea.indexOf("<maxima>") + "<maxima>".length();
                    int Fin = linea.indexOf("</maxima>");

                    String maxTemp = linea.substring(Inicio, Fin);
                    System.out.print(maxTemp + "\t \t");

                    while (linea != null && !linea.contains("<minima>")) {
                        linea = reader.readLine();
                    }

                    if (linea != null) { // Comprobamos que línea no es nula
                        int indexInicio = linea.indexOf("<minima>") + "<minima>".length();
                        int indexFin = linea.indexOf("</minima>");
                        int numero = Integer.parseInt(linea.substring(indexInicio, indexFin));
                        System.out.println(numero);

                        // Escribimos en el archivo de output
                        bw.write(dia + "\t" + maxTemp + "\t\t" + numero);
                        bw.newLine();
                        bw.flush();
                    }
                }
            }

            linea = reader.readLine();
        }
        reader.close();
        bw.close();
        fw.close();
    }
}