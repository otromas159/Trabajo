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
        Libro libro = new Libro("Sebastian",  "Las Aventuras del Botija", "Las 4 Torres", 5448);
        Revista revista = new Revista("Carlos",  "Los Famosos Tambien Sangran", "El Santo", 1675);
        Periodico periodico = new Periodico("Andres",  "Francotirador", "El Tiempo", 9314);
        
        
        System.out.println("El Libro");
        libro.mostrarDatos();
        System.out.println("La Revista");
        revista.mostrarDatos();
        System.out.println("El Periodico");
        periodico.mostrarDatos();
        }
}
