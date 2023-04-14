/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.espetaculo;

/**
 *
 * @author Felipe
 */
public class EspetaculoEspecial extends Espetaculo {
    private int horas;

    public EspetaculoEspecial() {
    }

    public EspetaculoEspecial(int horas) {
        this.horas = horas;
    }

    public EspetaculoEspecial(int horas, int cod, String endereco, String data, Cliente cliente) {
        super(cod, endereco, data, cliente);
        this.horas = horas;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    
    @Override
    public double valor() {
        return 200 * getHoras() + Espetaculo.getTaxaTransporte();
    }

    @Override
    public String toString() {
        return super.toString() + "EspetaculoEspecial{" + "horas=" + horas + '}';
    }
    
    
    
    
}
