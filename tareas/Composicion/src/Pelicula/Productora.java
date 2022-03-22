/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author YAHIR LIMAS
 */
public class Productora {
    private String nombre;
    private String fundador;

    public Productora() {
    }

    public Productora(String nombre, String fundador) {
        this.nombre = nombre;
        this.fundador = fundador;
    }

    public String getFundador() {
        return fundador;
    }

    public void setFundador(String fundador) {
        this.fundador = fundador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Productora{" + "nombre=" + nombre + ", fundador=" + fundador + '}';
    }
    public void rodaje(){
        System.out.println("La productora está realizando una película sorprendente.");
    }
}
