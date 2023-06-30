/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario  extends Endereco implements SalarioFinal{
    protected String nome;
     protected String rg;
     protected String cpf;
     protected Endereco endereco;
     protected Setor setor;
     protected Genero genero;
     protected double salario;
     protected LocalDate DataNascimento;

    public Funcionario(String nome, String rg, String cpf, Endereco endereco, Setor setor, Genero genero, double salario, LocalDate DataNascimento, String lofradouro, String numero, String complemento, String cep, UnidadeFederativa cidade) {
        super(lofradouro, numero, complemento, cep, cidade);
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.setor = setor;
        this.genero = genero;
        this.salario = salario;
        this.DataNascimento = DataNascimento;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(LocalDate DataNascimento) {
        this.DataNascimento = DataNascimento;
    }
     
    public int getIdade(LocalDate DataNacimento){
       return Period.between(DataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", endereco=" + endereco + super.toString()+ ", setor=" + setor + ", genero=" + genero + " salario=" + Util.FormatarMoeda(salario) + " DataNascimento=" + Util.Formataridade(DataNascimento) + "idade=" + getIdade(DataNascimento) + '}';
    }
     
     
}
