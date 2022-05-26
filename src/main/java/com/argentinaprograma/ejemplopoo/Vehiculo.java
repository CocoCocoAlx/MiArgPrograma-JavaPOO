/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.ejemplopoo;

/**
 *
 * @author i3-nativan
 */
public class Vehiculo {
    int num_registro;
    int ruedas;
    String marca;
    String modelo;

    public Vehiculo(int num_registro, int ruedas, String marca, String modelo) {
        this.num_registro = num_registro;
        this.ruedas = ruedas;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Vehiculo() {
    }

    public void estacionar(){
        System.out.println("Estacionando");
    }

    public int getNum_registro() {
        return num_registro;
    }

    public void setNum_registro(int num_registro) {
        this.num_registro = num_registro;
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
