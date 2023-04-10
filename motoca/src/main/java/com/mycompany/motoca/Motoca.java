/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motoca;

/**
 *
 * @author Felipe
 */
public class Motoca {
    private int cod;
    private Personagem personagem;
    private double valor = 250.00;
    
    public Motoca () {
        
    }
     public Motoca (int cod, Personagem personagem) {
         this.cod = cod;
         this.personagem = personagem;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
    
    public double preco() {
        return valor;
    }

    @Override
    public String toString() {
        return "Motoca{" + "cod=" + cod + ", personagem=" + personagem + '}';
    }
}
