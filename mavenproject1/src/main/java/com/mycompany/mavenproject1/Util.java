/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Aluno
 */
public class Util {
   
    public static String Formataridade(LocalDate DataNasimento){
      DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      return formatar.format(DataNasimento);
    }
    
    public static double FormatarMoeda(Double moeda){
    NumberFormat format = NumberFormat.getCurrencyInstance();
    return moeda;
    }
 }
