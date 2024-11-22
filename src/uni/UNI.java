/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uni;

import java.util.Scanner;

/**
 *
 * @author Maria Gabriela
 */
public class UNI {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuarcompras = true;
        int menu, peque = 0, medi = 0, gran = 0, edad; 
        double total = 0;
        int tamano, clientes = 0;
        double totdescuentos=0;

        while (true) {
            System.out.println("Buen Dia! Bienvenido a Café Express UNI. Que desea realizar?\n"
                    + "1. Comprar cafe\n"
                    + "2. Cerrar caja y obtener factura");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                System.out.println("Que tamaño desea su cafe?\n"
                        + "1. Pequeño - Lps.45\n"
                        + "2. Mediano - Lps.56\n"
                        + "3. Grande - Lps.65\n");
                tamano = entrada.nextInt();

                switch(tamano){
                    case 1:
                        total+=45;
                        peque++;
                        break;
                    case 2:
                        total+=56;
                        medi++;
                        break;
                    case 3:
                        total+=65;
                        gran++;
                        break;
                    default:
                        System.out.println("Favor ingrese una opcion posible!");
                        continue;
                        
                } 
                
                System.out.println("Que agregado desea poner en su cafe?\n"
                        + "1. Leche - Lps.5\n"
                        + "2. Cremora - Lps.8\n"
                        + "3. Sencillo (sin agregado)- Lps.0 \n");
                int agregado=entrada.nextInt();
                
                switch (agregado){
                    case 1:
                        total+=5;
                        break;
                    case 2:
                        total+=8;
                        break;
                    case 3:
                        total+=0;
                        break;
                    default:
                        System.out.println("Favor ingrese una opcion posible!");
                        continue;
                }
                System.out.println(" Favor ingrese su edad");
                edad=entrada.nextInt();
                
                if(edad>=60){
                    totdescuentos+= (total-(total*0.25));
                }else{
                    totdescuentos+=total;
                }
                
                
                clientes++;   
            
                case 2: 
                System.out.println("Eligio cerrar la caja!");
                System.out.println("");
                System.out.println("Total de clientes en el dia: "+clientes);
                System.out.println("Total de cafes pequeños vendidos: "+peque);
                System.out.println("Total de cafes medianos vendidos: "+medi);
                System.out.println("Total de cafes grandes vendidos: "+gran);
                System.out.println("El total de ventas que realizo es Lps."+totdescuentos);
                break;
            
                default:
                System.out.println("Opcion no valida, elija una correcta");
                System.out.println("");
                continue;
            }
            }
            

        }
    }

