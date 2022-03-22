/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pelicula;

/**
 *
 * @author YAHIR LIMAS
 */
public class Actor {
    private String nacionalidad;
    private int edad;

    public Actor() {
    }

    public Actor(String nacionalidad, int edad) {
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Actor{" + "nacionalidad=" + nacionalidad + ", edad=" + edad + '}';
    }
    public void llorar(){
        System.out.println("El actor está llorando, ¡Qué increíble!");
    }
}
