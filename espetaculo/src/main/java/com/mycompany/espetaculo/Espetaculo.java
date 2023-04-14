/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.espetaculo;



/**
 *
 * @author Felipe
 */
public class Espetaculo {

    
    private int cod;
    private String endereco,data;
    private  Cliente cliente;
    private static double taxaTransporte;

    public Espetaculo() {
    }

    public Espetaculo(int cod, String endereco, String data, Cliente cliente) {
        this.cod = cod;
        this.endereco = endereco;
        this.data = data;
        this.cliente = cliente;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public static double getTaxaTransporte() {
        return taxaTransporte;
    }

    public static void setTaxaTransporte(double taxaTransporte) {
        Espetaculo.taxaTransporte = taxaTransporte;
    }
    
    public double valor() {
        return 250 + getTaxaTransporte();
    }

    @Override
    public String toString() {
        return "Espetaculo{" + "cod=" + cod + ", endereco=" + endereco + ", data=" + data + ", cliente=" + cliente + '}';
    }

    

    
    
    
    
}
