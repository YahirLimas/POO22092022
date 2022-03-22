/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author YAHIR LIMAS
 */
public class Director {
    private String nombre;
    private String idioma;

    public Director() {
    }

    public Director(String nombre, String idioma) {
        this.nombre = nombre;
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", idioma=" + idioma + '}';
    }
    public void dirigir(){
        System.out.println("El director está asignando los trabajos a la producción.");
    }
}
