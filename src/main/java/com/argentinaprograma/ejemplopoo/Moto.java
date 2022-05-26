/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.ejemplopoo;

/**
 *
 * @author i3-nativan
 */
public class Moto extends Vehiculo{
    int cilindrada;

    public Moto() {
    }

    public Moto(int cilindrada, int num_registro, int ruedas, String marca, String modelo) {
        super(num_registro, ruedas, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
    
}
