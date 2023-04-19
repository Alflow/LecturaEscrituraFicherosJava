/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficheros_alfredo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Alflow
 * @param nombre el nombre del usuario
 **/
public class Ejer2 {

    public static Scanner sc = new Scanner(System.in);

    public static void ejer2() {
        System.out.println("Bienvenido al ejercicio 2");
        int edad = 0;
        String nombre;

        System.out.println("Por favor, indique su nombre:");
        nombre = sc.nextLine();
        System.out.println("De acuerdo. Indique su edad: ");
        edad = sc.nextInt();
        sc.nextLine(); // limpiamos escaner.
        try {
            /*Creamos un Escritor de Buffer que contenga un escritor de archivo, y le ponemos nombre al archivo. 
            OJITO CUIDAO' ...El append estando en false..,
            indica que sobreescribirá los datos en él en caso de existir el fichero.*/
            BufferedWriter out = new BufferedWriter(new FileWriter("datos.txt", false));

            out.write(nombre);
            out.newLine();
            out.write(Integer.toString(edad)); // convierte el INT en un String
            out.newLine();
            out.close();
            System.out.println("Los datos se han guardado correctamente en el archivo personas.txt");

        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo : " + e.getMessage());
        }

    }
}
