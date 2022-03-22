/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libro;

/**
 *
 * @author YAHIR LIMAS
 */
public class Editorial {
    private String nombre;
    private String sucursal;

    public Editorial() {
    }

    public Editorial(String nombre, String sucursal) {
        this.nombre = nombre;
        this.sucursal = sucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Editorial{" + "nombre=" + nombre + ", sucursal=" + sucursal + '}';
    }
    public void publicar(String libro){
        System.out.println("El libro "  + libro + " está siendo publicado.");
    }
}
