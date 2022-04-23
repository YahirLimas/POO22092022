/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author YAHIR LIMAS
 */
public class Cuentahabiente {
    private int idCliente;
    private String nombre;
    private float balance;

    public Cuentahabiente() {
    }

    public Cuentahabiente(int idCliente, String nombre, float balance) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cuentahabiente{" + "idCliente=" + idCliente + ", nombre=" + nombre + ", balance=" + balance + '}';
    }
 
    public void retirarDinero(float monto){
        //Código para restarle el monto al balance
        balance = balance - monto;
        System.out.println("Balance = $" + balance);
    }
    public String evaluarNivelCliente(){
        /*Dependiendo el balance debe regresar un String con una de estas dos opciones:
        1.-"Cliente Regular" si es menor o igual a 50 mil.
        2.-"Cliente Premium si es mayor a 50 mil."*/
        return this.balance <= 50000? "Cliente Regular" : "Cliente Premium";
    }
}