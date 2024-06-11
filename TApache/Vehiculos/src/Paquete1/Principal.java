/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author SENA
 */
public class Principal {
    public static void main(String[] args){
        Carro carro = new Carro();
        Moto moto  = new Moto();
        Bicicleta bicicleta = new Bicicleta();
        
        carro.mover();
        moto.mover();
        bicicleta.mover();
               
    }
}
