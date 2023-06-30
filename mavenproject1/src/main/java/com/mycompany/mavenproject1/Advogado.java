/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Advogado extends Funcionario {
   private String oab;

    public Advogado(String oab, String nome, String rg, String cpf, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate DataNascimento, String lofradouro, String numero, String complemento, String cep, UnidadeFederativa cidade) {
        super(nome, rg, cpf, endereco, setor, genero, salario, DataNascimento, lofradouro, numero, complemento, cep, cidade);
        this.oab = oab;
    }

   

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

     @Override
    public double getSalarioFinal(double salarioaFinal) {
        return salario;
    }
    
    @Override
    public String toString() {
        return "Advogado{" + super.toString()+ "oab=" + oab + "Salario=" + getSalarioFinal(salario)+ '}';
    }

   
   
   
}
