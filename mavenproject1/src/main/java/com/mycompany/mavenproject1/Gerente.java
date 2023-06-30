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
public class Gerente  extends CargodeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String rg, String cpf, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate DataNascimento, String lofradouro, String numero, String complemento, String cep, UnidadeFederativa cidade) {
        super(bonificacao, nome, rg, cpf, endereco, setor, genero, salario, DataNascimento, lofradouro, numero, complemento, cep, cidade);
    }

    

    @Override
    public double getSalarioFinal(double salarioaFinal) {
       salario += salario * 0.35;
       return salario; 
    }

    @Override
    public String toString() {
        return "Gerente{"+ super.toString()+ '}';
    }
    
    
}
