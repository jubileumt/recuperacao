/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public class Endereco {
   protected String lofradouro; 
   protected String numero;
   protected String complemento;
   protected String cep;
   protected UnidadeFederativa cidade;

    public Endereco(String lofradouro, String numero, String complemento, String cep, UnidadeFederativa cidade) {
        this.lofradouro = lofradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getLofradouro() {
        return lofradouro;
    }

    public void setLofradouro(String lofradouro) {
        this.lofradouro = lofradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public UnidadeFederativa getCidade() {
        return cidade;
    }

    public void setCidade(UnidadeFederativa cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + lofradouro + ", numero=" + numero + ", complemento=" + complemento + ", cep=" + cep + ", cidade=" + cidade + '}';
    }
   
   
}
