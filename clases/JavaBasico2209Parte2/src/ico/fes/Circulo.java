/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes;

/**
 *
 * @author YAHIR LIMAS
 */
//Clase que sólamente tiene atributos y métodos... Java Bean , POJO (objetos planos de java), es diferente a los EJB Enterprise Java Bean
public class Circulo implements Figura{
    private float radio;

    public Circulo() {
    }

    public Circulo(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + '}';
    }

    @Override
    public float calcularArea() {
        return Figura.PI * (this.radio * this.radio);
    }
    /**
     * Principio de diseño de Lenguaje de programación: 0, 1 e infinito: Solo los valores
     * 0, 1 e infinito son válidos para usarse en la codificación de algoritmos.
     * El lenguaje de programación debe proporcionar un mecanismo para evitar usar
     * literales numéricas en el programa.
     **/
    
}