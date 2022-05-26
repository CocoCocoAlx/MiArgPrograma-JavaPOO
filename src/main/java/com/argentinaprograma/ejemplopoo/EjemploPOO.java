/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.argentinaprograma.ejemplopoo;

/**
 *
 * @author i3-nativan
 */
public class EjemploPOO {
    public static void main(String[] args){
        Auto auto02=new Auto (45, "AA 555 BB", 5, "Negro", true, 34567, 4, "Renault", "Megane");
        Moto moto01 = new Moto(150, 8857, 2, "Zanella", "ZR125");
        Camion camion01 = new Camion(6, true, 124673, 8, "Volvo", "FR256");
        Vehiculo vehiculo01 = new Vehiculo(12992, 3, "Citroen", "Remolque");
        
        Vehiculo vector[]=new Vehiculo[4];
        vector[0]=auto02;
        vector[1]=moto01;
        vector[2]=camion01;
        vector[3]=vehiculo01;
        
        for (int i=0; i<4; i++) {
            System.out.println("Registro n° " + i + " " + vector[i].getMarca());
    }
    }
        /*auto02.encender();
        auto02.acelerar(60);
        auto02.frenar(30);
        auto02.apagar();
        
        System.out.println("El valor de la ID es: "+auto02.getId());
        auto02.setId(46);
        System.out.println("El nuevo valor de la ID es: "+auto02.getId());
        */
        
        /*System.out.println("La id del auto01 es: "+auto01.getId());
        System.out.println("El color del auto01 es: "+auto01.getColor());
        
        auto01.setId(78);
        auto01.setColor("Blanco");
        auto01.setPatente("AB 005 DD");
        auto01.setCaja_manual(true);
        
        System.out.println("La nueva id del auto01 es: "+auto01.getId());
        System.out.println("El color del auto01 es: "+auto01.getColor());
        System.out.println("La patente del auto01 es: "+auto01.getPatente());
        System.out.println("Caja manual: "+auto01.caja_manual);
        */
        /*System.out.println(auto02.toString());
        System.out.println(auto01.toString());
*/
        
    }
 
