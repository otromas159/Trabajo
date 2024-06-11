/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

/**
 *
 * @author SENA
 */
public class CuentaBancaria {
    private int numerocuenta;
    private String nombre;
    private int saldo;
    
    public CuentaBancaria(int numerocuenta, String nombre, int saldo){
        this.numerocuenta = numerocuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public void setNumerocuenta(int numerocuenta){
        this.numerocuenta = numerocuenta;
    }
    public int getNumerocuenta(){
        return numerocuenta;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setSaldo(int saldo){
        this.saldo = saldo;
    }
    public int getSaldo(){
        return saldo;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: " + getNombre() + "\nNumero de Cuenta: " + getNumerocuenta() + "\nSaldo: " + getSaldo());
    }
}
