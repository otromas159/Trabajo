/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author SENA
 */
public class Periodico extends Material{
    
    private String autor;

public Periodico(String autor, String nombre, String editorial, int codigo){
    super(nombre, editorial, codigo);
    this.autor = autor;
    
}

public void mostrarDatos(){
     System.out.println("Nombre: " + getNombre() + "\nAutor: " + autor + "\nCodigo: " + getCodigo() + "\nEditorial: " + getEditorial());
     
}
    
}
