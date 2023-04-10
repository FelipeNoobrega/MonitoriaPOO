/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motoca;

/**
 *
 * @author Felipe
 */
public class MotocaComCapota extends Motoca {
    private String corCapota;

    public MotocaComCapota() {
    }

    public MotocaComCapota(int cod, Personagem personagem, String corCapota) {
        super(cod, personagem);
        this.corCapota = corCapota;
    }

    public String getCorCapota() {
        return corCapota;
    }

    public void setCorCapota(String corCapota) {
        this.corCapota = corCapota;
    }

    @Override
    public String toString() {
        return super.toString()+" MotocaComCapota{" + "corCapota=" + corCapota + '}';
    }
    
    public double preco() {
        return super.preco() * 1.2;
    }
}
