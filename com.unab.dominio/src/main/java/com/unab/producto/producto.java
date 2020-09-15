/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unab.producto;

/**
 *
 * @author diosc
 */
public class producto {
    
       public Double funcPromedio1(String num1, String num2){
       Double lab1 = Double.parseDouble(num1);  
       Double Exa1 = Double.parseDouble(num2);
       
       Double PromedioLab1 = lab1 * 0.40;
       Double PromedioExa1 = Exa1 * 0.60;
       
       Double Promedio1 = PromedioLab1 + PromedioExa1;
       Promedio1 /= 3;
       
       return Promedio1;
       }
       
       public Double funcPromedio2(String num1, String num2){
       Double lab2 = Double.parseDouble(num1);  
       Double Exa2 = Double.parseDouble(num2);
       
       Double PromedioLab2 = lab2 * 0.40;
       Double PromedioExa2 = Exa2 * 0.60;
       
       Double Promedio2 = PromedioLab2 + PromedioExa2;
       Promedio2 /= 3;
       
       return Promedio2;
       } 
      
       public Double funcPromedio3(String num1, String num2){
       Double lab1 = Double.parseDouble(num1);  
       Double Exa1 = Double.parseDouble(num2);
       
       Double PromedioLab3 = lab1 * 0.40;
       Double PromedioExa3 = Exa1 * 0.60;
       
       Double Promedio3 = PromedioLab3 + PromedioExa3;
       Promedio3 /= 3;
       
       return Promedio3;
       }
       
       public Double funcPromedioFinal(Double Promedio1, Double Promedio2, Double Promedio3){
       Double PromedioFinal = Promedio1 + Promedio2 + Promedio3; 
       
       return PromedioFinal;
       }
       
}

