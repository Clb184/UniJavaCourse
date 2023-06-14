/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.pe.utp.laboratorio12;

/**
 *
 * @author sebas
 */
public class CHeight {
    double m_Meters;
    double m_Centimeters = 0.0;
    double m_Feet = 3.0;
    double m_Inches = 4.0;
    
    public void calcFeet2cm(){
        this.m_Centimeters += this.m_Feet * 12.0 * 2.54;
    }
    
    public void calcInches2cm(){
        this.m_Centimeters += this.m_Inches * 2.54;
    }
    public void calcCentimeters2m(){
        this.m_Meters += this.m_Centimeters * 0.01;
    }
    
    public void printMeters(){
        System.out.print(this.m_Meters);
    }
    
}
