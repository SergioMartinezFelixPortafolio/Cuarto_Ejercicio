/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuartoejercicio;

import java.util.Scanner;

/**
 *
 * @author sergi
 */
public class CuartoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("First number ");
        Scanner scan = new Scanner(System.in);
        float number1 = Float.parseFloat(scan.nextLine());
        System.out.println("Second number ");
        float number2 = Float.parseFloat(scan.nextLine());
        System.out.println("Which calculation do you want to do? ");

        switch (scan.nextLine().toLowerCase()) {
            case "addition":
                System.out.println(number1 + " + " + number2 + "=" + " " + (number1 + number2));
                break;
            case "subtraction":
                System.out.println(number1 + " - " + number2 + "=" + " " + (number1 - number2));
                break;
            case "multiplication":
                System.out.println(number1 + " x " + number2 + "=" + " " + (number1 * number2));
                break;
            case "division":
                System.out.println(number1 + " / " + number2 + "=" + " " + (number1 / number2));
                break;
            case "modulo":
                System.out.println(number1 + "%" + number2 + "=" + " " + (number1 % number2));
                break;

        }

    }
}
