/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("lofradouro", "numero", "complemento", "cep", UnidadeFederativa.BAHIA);
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "nome", "rg", "123", endereco, Setor.MARKETING, Genero.FEMININO, 1110, LocalDate.of(2000, Month.APRIL, 30), "logradouro", "numero", "complemento", "cep", UnidadeFederativa.BAHIA);
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "nome", "rg", "123", endereco, Setor.MARKETING, Genero.FEMININO, 1110, LocalDate.of(2000, Month.APRIL, 30), "logradouro", "numero", "complemento", "cep", UnidadeFederativa.BAHIA);
        Advogado advogado = new Advogado("123", "nome"," rg", "cpf", endereco, Setor.MARKETING, Genero.FEMININO, 7000, LocalDate.of(2000, Month.APRIL, 30), "lofradouro", "numero", "complemento", "cep", UnidadeFederativa.BAHIA);
        Motorista motorista = new Motorista("123", "nome"," rg", "cpf", endereco, Setor.MARKETING, Genero.FEMININO, 7000, LocalDate.of(2000, Month.APRIL, 30), "lofradouro", "numero", "complemento", "cep", UnidadeFederativa.BAHIA);
        
        System.out.println(diretor);
        System.out.println("");
        diretor.demitir(motorista);
        System.out.println("");
        System.out.println(gerente);
        System.out.println("");  
        System.out.println(advogado);
        System.out.println("");
        System.out.println(motorista);
    }
}
