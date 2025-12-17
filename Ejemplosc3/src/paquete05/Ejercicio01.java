/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] nombres = new String[5];
        double[] produccion = new double[5];
        String name;
        double produ;
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese nombre del trabajador");
            name = entrada.nextLine();
            nombres[i] = name;
            
            System.out.println("Ingrese produccion en dolares");
            produ = entrada.nextDouble();
            produccion[i] = produ;
            
        }

    }

}
}
