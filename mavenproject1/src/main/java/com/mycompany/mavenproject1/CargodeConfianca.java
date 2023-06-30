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
public abstract class CargodeConfianca  extends Funcionario{
    protected Bonificacao bonificacao;

    public CargodeConfianca(Bonificacao bonificacao, String nome, String rg, String cpf, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate DataNascimento, String lofradouro, String numero, String complemento, String cep, UnidadeFederativa cidade) {
        super(nome, rg, cpf, endereco, setor, genero, salario, DataNascimento, lofradouro, numero, complemento, cep, cidade);
        this.bonificacao = bonificacao;
    }

   

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }
    
    
}
