/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase9;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};

        int tabla;

        for (int contador = 1; contador < arreglo.length; contador = contador + 2) {
            
            for (int contador2 = 1; contador2 <= 12; contador2++) {
                tabla = arreglo[contador] * contador2;
                System.out.printf("%d * %d = %d\n", arreglo[contador], contador2, tabla);                        
            }
            System.out.println("\n");
        }
    }
}
