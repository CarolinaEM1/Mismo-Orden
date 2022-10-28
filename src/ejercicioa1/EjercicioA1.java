/*
 Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido
 */
package ejercicioa1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class EjercicioA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float [] numeros = new float[5];
      
        for (int i=0;i<numeros.length; i++){
            System.out.println((i+1)+". Digite un número: ");
            numeros[i]= entrada.nextFloat();
        }
        System.out.println("\nImprimir los elementos del arreglo");
        for (float i:numeros){
            System.out.println(i);
        }
        
    }
    
}
