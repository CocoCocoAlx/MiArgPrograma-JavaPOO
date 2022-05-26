/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.argentinaprograma.ejemplopoo;

/**
 *
 * @author i3-nativan
 */
public class Auto extends Vehiculo{
    // declaración de atributos globales
    private int id;
    private String patente;
    private int cant_puertas;
    private String color;
    private boolean caja_manual;
    
    // constructores

    public Auto() {
    }

    public Auto(int id, String patente, int cant_puertas, String color, boolean caja_manual, int num_registro, int ruedas, String marca, String modelo) {
        super(num_registro, ruedas, marca, modelo);
        this.id = id;
        this.patente = patente;
        this.cant_puertas = cant_puertas;
        this.color = color;
        this.caja_manual = caja_manual;
    }

    
    public int getId() {    
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    // declaración de métodos
    
    // getters y setters
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCant_puertas() {
        return cant_puertas;
    }

    public void setCant_puertas(int cant_puertas) {
        this.cant_puertas = cant_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCaja_manual() {
        return caja_manual;
    }

    
    public void setCaja_manual(boolean caja_manual) {    
        this.caja_manual = caja_manual;
    }

    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", patente=" + patente + ", cant_puertas=" + cant_puertas + ", color=" + color + ", caja_manual=" + caja_manual + '}';
    }

    // métodos
    
    public void encender() {
        System.out.println("Proceso de encendido del motor");
    }
    
    public void apagar () {
        System.out.println("Proceso de detención del motor");
    }
    
    public void acelerar(double km){
        System.out.println("Aceleración: "+km+" km/s");
    }
    
    public void frenar(double km){
        System.out.println("Frenado: "+km+" km/s");
    }

}


