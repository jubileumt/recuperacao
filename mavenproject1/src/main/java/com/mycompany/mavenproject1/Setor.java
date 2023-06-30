/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Aluno
 */
public enum Setor {
        ENGENHARIA("Engenharia"),
        MARKETING("Marketing"),
        RECURSO_SHUMANOS("Recursos Humanos"),
        JURIDICO("Juridico"),
        OPERACOES("Operacoes");
        
        
        private String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
        
        
}
