/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motoca;

/**
 *
 * @author Felipe
 */
public class MotocaEletrica extends Motoca {
    private int voltagem;

    public MotocaEletrica() {
    }

    public MotocaEletrica(int cod, Personagem personagem, int voltagem) {
        super(cod, personagem);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return super.toString()+" MotocaEletrica{" + "voltagem=" + voltagem + '}';
    }
    
    @Override
    public double preco() {
        return super.preco()*1.5;
    }
}
