/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author SENA
 */
public class Material {
    
     private String nombre;
    private String editorial;
    private int codigo;
    
    public Material(String nombre, String editorial, int codigo){
        this.nombre = nombre;
        this.editorial = editorial;
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
   
    }
    public String getNombre(){
        return nombre;  
    }
    
    public void Editorial(String editorial){
        this.editorial = editorial;
    }
    public String getEditorial(){
        return editorial;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return codigo;
    }
    
}
