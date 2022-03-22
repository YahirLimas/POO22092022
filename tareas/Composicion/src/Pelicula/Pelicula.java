/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author YAHIR LIMAS
 */
public class Pelicula {
    private String nombre;
    private Actor actor;
    private Productora productora;
    private Director director;

    public Pelicula() {
    }

    public Pelicula(String nombre, Actor actor, Productora productora, Director director) {
        this.nombre = nombre;
        this.actor = actor;
        this.productora = productora;
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Productora getProductora() {
        return productora;
    }

    public void setProductora(Productora productora) {
        this.productora = productora;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nombre=" + nombre + ", actor=" + actor + ", productora=" + productora + ", director=" + director + '}';
    }
    
}
