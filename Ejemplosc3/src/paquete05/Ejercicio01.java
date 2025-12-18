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
        double[][] produccion = new double[5][12];
        double[] total = new double[5];
        double mayorProd;
        int mayor;
        String mensaje;
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Ingrese nombre del trabajador");
            nombres[i] = entrada.nextLine();
            for (int j = 0; j < produccion[i].length; j++){
                System.out.printf("Ingrese produccion del mes (%d) en "
                        + "dolares:", j+1);
                produccion[i][j] = entrada.nextDouble();
                entrada.nextLine();
                
                total[i] = total[i] + produccion[i][j];
            }
        }
        
        mayorProd = total[0];
        mayor = 0;
        
        for (int i = 1; i < total.length; i++){
            if(total[i] > mayorProd){
                mayorProd = total[i];
                mayor = i;
            }
        }
        
        mensaje = String.format("\nAnálisis de Producción\nEstación\n");
        
        for (int i = 0; i < total.length; i++){
            mensaje = String.format("%sNombre Estación %d - Total producción: "
                    + "$ %.2f\n", 
                    mensaje,
                    i + 1,
                    total[i]);
        }
        
        mensaje = String.format("%s\nEstación más productiva: Nombre Estación "
                + "%d\nEncargado de la estación: %s\n"
                + "Cantidad de la estación más productiva: $%.2f", 
                mensaje,
                mayor + 1, 
                nombres[mayor],
                mayorProd);
        
        System.out.printf(mensaje);
    }
}
