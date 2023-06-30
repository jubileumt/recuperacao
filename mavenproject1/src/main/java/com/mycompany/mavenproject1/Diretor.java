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
public class Diretor extends CargodeConfianca implements Contratacao{
    private final double premio = 0.5;

    public Diretor(Bonificacao bonificacao, String nome, String rg, String cpf, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate DataNascimento, String lofradouro, String numero, String complemento, String cep, UnidadeFederativa cidade) {
        super(bonificacao, nome, rg, cpf, endereco, setor, genero, salario, DataNascimento, lofradouro, numero, complemento, cep, cidade);
    }
    
    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public double getSalarioFinal(double salarioaFinal) {
        salario += salario * premio;
        salario += salario * 0.45;
        return salario;
    }

    @Override
    public String toString() {
        return "Diretor{" +super.toString()+ "premio=" + premio + "Salario"+ getSalarioFinal(salario);
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo funcionario" + toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Diretor demitindo funcionario "+ toString());
    }
     
    
}
