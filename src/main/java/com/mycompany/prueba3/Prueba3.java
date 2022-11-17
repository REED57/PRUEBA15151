
package com.mycompany.prueba3;

import java.util.Scanner;

/**
 *
 * @author de337
 */
public class Prueba3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = 0;
        int num2 =0;
        
        
        System.out.println("dime un numero ");
        num1 = reader.nextInt();
        
        
        System.out.println("dime otro numero");
        num2 = reader.nextInt();
        
        int resultado = num1+num2;
        
        System.out.println("el resultado de la suma es "+num1+ "+"+num2+ "=" +resultado);
    }
}
