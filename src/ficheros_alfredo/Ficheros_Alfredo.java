/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros_alfredo;



import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author Alflow
 * @param exit 
 */
public class Ficheros_Alfredo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
       
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        System.out.println("Bienvenido a los ejercicios de Alfredo Alberruche (FICHEROS)");
        String workingDirectory = System.getProperty("user.dir");
        
        System.out.println("\033[32m" +"Carpeta de trabajo actual: " + workingDirectory);
       
        while(!salir){
            System.out.println("""
                           Seleccione el ejercicio que quiere ejecutar:
                           1- Ejercicio 1 (primer pdf -> Lectura de ficheros)
                           2- Ejercicio 2 (primer pdf -> Escritura de ficheros)
                           3- Ejercicio 3 (Ejercicio de XML)
                           0-Terminar programa""");

            switch (sc.nextInt()) {
                case 1:
                    Ejer1.Ejer1();
                    break;

                case 2:
                    Ejer2.ejer2();
                    break;
                case 3:
                {
                    String fichero;
                    fichero="localidad_26089";
                    Ejer3.Ejer3(fichero);
                    break;
                }

                case 0:{
                    salir=true;
                    System.out.println("Programa finalizado, gracias por su visita");
                    break;
                }
                    
                  default:{
                    System.out.println("Opcion introducida no valida");
                    break;
                }
                

            }
            

        }

    }

}
