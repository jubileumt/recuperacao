/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public enum UnidadeFederativa {
    BAHIA("Ba","Bahia"),
    SAOPAULO("SP","Sao Paulo"),
    RIODEJANEIRO("RJ", "Sao Paulo");
    
    private String sigla;
    private String texto;

    private UnidadeFederativa(String sigla, String texto) {
        this.sigla = sigla;
        this.texto = texto;
    }

    public String getSigla() {
        return sigla;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
