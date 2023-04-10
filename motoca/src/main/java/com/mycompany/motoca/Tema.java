/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motoca;

/**
 *
 * @author Felipe
 */
public class Tema {
    private int cod;
    private String nome;
    
    public Tema() {
        
    }
    
    public Tema (int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }
    
    public int getCod() {
        return cod;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setCod(int cod) {
        this.cod = cod;
    }
    
    public void setName(String nome) {
        this.nome = nome;
    }
}
