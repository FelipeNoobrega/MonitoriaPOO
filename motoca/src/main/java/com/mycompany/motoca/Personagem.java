/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motoca;

/**
 *
 * @author Felipe
 */
public class Personagem {
    private int cod;
    private String nome;
    private Tema tema;
    
    public Personagem() {
        
    }
    
    public Personagem( int cod, String nome, Tema tema) {
        this.cod = cod;
        this.nome = nome;
        this.tema = tema;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Tema getTema() {
        return tema;
    }

    public void setTema(Tema tema) {
        this.tema = tema;
    }

    @Override
    public String toString() {
        return "Personagem{" + "cod=" + cod + ", nome=" + nome + ", tema=" + tema + '}';
    }
}
