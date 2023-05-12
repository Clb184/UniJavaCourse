/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pe.utp.laboratorio7;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner hoge = new Scanner(System.in);
        
        //Some vars...
        int bolNum = 0;
        String lastName;
        int kind, amount;
        double price, tot = 0.0, dolPrice;
        
        //Flag for end
        boolean end;
        int hold;
        
        do{
            price = 0.0;
            System.out.print("Ingrese el apellido del cliente: "); lastName = hoge.next();
            do{
                do{
                    System.out.print("Elija la marca de celular a comprar:\n"); 
                    System.out.print("[1] - Nokia.\n");
                    System.out.print("[2] - Motorola.\n");
                    System.out.print("[3] - Sony.\n");
                    System.out.print("[4] - Samsung.\n");
                    kind = hoge.nextInt();
                    if(kind < 1 || kind > 4)
                        System.out.print("Ingrese una opción válida.\n");
                }while(kind < 1 || kind > 4);
                System.out.print("Ingrese la cantidad de teléfonos a comprar: "); amount = hoge.nextInt();
                switch(kind){
                    case 1:
                        price += amount * 69.0;
                        break;
                    case 2:
                        price += amount * 98.0;
                        break;
                    case 3:
                        price += amount * 127.0;
                        break;
                    case 4:
                        price += amount * 131.0;
                        break;
                }
                
                do{
                    System.out.println("Desea seguir comprando? [1 Si / 2 No]: "); hold = hoge.nextInt();
                    if(hold != 1 && hold != 2)
                        System.out.print("Ingrese una opción válida.\n");
                }while(hold != 1 && hold != 2);
            }while(hold == 1);
            dolPrice = price / 3.28;
            
            System.out.print("***********BOLETA DE PAGO************\n");
            System.out.print("Boleta n°: " + bolNum + "\n");
            System.out.print("Apellido del cliente: " + lastName + "\n");
            System.out.print("Total a pagar (Soles): " + price + "\n");
            System.out.print("Total a pagar (Dólares): " + dolPrice + "\n");
            System.out.print("*************************************\n");
            
            tot += price;
            do{
                System.out.println("Desea cerrar la caja? [1 Si / 2 No]: "); hold = hoge.nextInt();
                if(hold != 1 && hold != 2)
                    System.out.print("Ingrese una opción válida.\n");
            }while(hold != 1 && hold != 2);
            end = hold == 1;
            if(!end)
                bolNum++;
            
        }while(!end);
        System.out.print("Total recaudado: " + tot + "\n");
        
    }
}
