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
public class Motorista extends Funcionario{
    private String CarteiraDeHabilitacao;

    public Motorista(String CarteiraDeHabilitacao, String nome, String rg, String cpf, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate DataNascimento, String lofradouro, String numero, String complemento, String cep, UnidadeFederativa cidade) {
        super(nome, rg, cpf, endereco, setor, genero, salario, DataNascimento, lofradouro, numero, complemento, cep, cidade);
        this.CarteiraDeHabilitacao = CarteiraDeHabilitacao;
    }

   public String getCarteiraDeHabilitacao() {
        return CarteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String CarteiraDeHabilitacao) {
        this.CarteiraDeHabilitacao = CarteiraDeHabilitacao;
    }

    @Override
    public String toString() {
        return "Motorista{" + super.toString() + "CarteiraDeHabilitacao=" + CarteiraDeHabilitacao + '}';
    }

    @Override
    public double getSalarioFinal(double salarioaFinal) {
        return salario;
    }

   
    
}
