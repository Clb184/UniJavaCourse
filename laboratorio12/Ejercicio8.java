/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pe.utp.laboratorio12;

/**
 *
 * @author sebas
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        CHeight h = new CHeight();
        h.calcFeet2cm();
        h.calcInches2cm();
        h.calcCentimeters2m();
        System.out.print("Medida en metros: "); h.printMeters(); System.out.print(" metros.\n");
    }
}
