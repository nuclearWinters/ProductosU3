/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.productos;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author Armando
 */
public class Productos {
    private BigDecimal total = new BigDecimal(0);
    public Productos(){
    }
    public BigDecimal getTotal () { return total; } 
    public void setTotal(BigDecimal precio, int cantidad){
        this.total = this.total.add(precio.multiply(new BigDecimal(cantidad)));
    }
    public static void main(String[] args) {
        Productos total = new Productos();
        //total.setTotal(new BigDecimal(0), 0);
        String isYORN = "";
        while (true) {
            if (isYORN.equals("N")) {
                System.out.println("El total es: " + total.getTotal());
                break;
            }
            System.out.println("Introduce el número de un producto (1, 2, 3, 4 ó 5): ");
            Scanner inputNumero = new Scanner(System.in);
            String numero = inputNumero.next();
            System.out.println("Introduce la cantidad que desea comprar: ");
            Scanner inputCantidad = new Scanner(System.in);
            int cantidad = inputCantidad.nextInt();
            switch(numero) {
                case "1":
                    total.setTotal(new BigDecimal("2.98"), cantidad);
                    break;
                case "2":
                    total.setTotal(new BigDecimal("4.50"), cantidad);
                    break;
                case "3":
                    total.setTotal(new BigDecimal("9.98"), cantidad);
                    break;
                case "4":
                    total.setTotal(new BigDecimal("4.49"), cantidad);
                    break;
                case "5":
                    total.setTotal(new BigDecimal("6.87"), cantidad);
                    break;
                default:
            }
            isYORN = "";
            while (true) {
                if (isYORN.equals("Y") || isYORN.equals("N")) {
                    break;
                }
                System.out.println("¿Desea continuar (Y/N)?: ");
                Scanner inputContinuar = new Scanner(System.in);
                isYORN = inputContinuar.next();
            }
        }
    }
}
