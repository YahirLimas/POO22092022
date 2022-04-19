/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasico2209;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author YAHIR LIMAS
 */
public class JavaBasico2209 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 20;
        System.out.println("Edad = " + edad);
        Integer edad2 = new Integer(22);
        System.out.println(edad2);
        double X = edad2.doubleValue();
        System.out.println(X);
        System.out.println(edad2.shortValue());
        System.out.println("-.-.-.-.-.-.-.-.-");
        // Convertir Strings a entero.
        String cadena = "99";
        int altura = Integer.parseInt(cadena); // Método miembro o método de clase
        Color c1 = Color.BLUE; // Atributo miembro o atributo de clase
        
        altura += 1;
        System.out.println("Altura = " + altura);
        
        float y = Float.parseFloat(cadena);
        y = y + 0.5f;
        System.out.println("Altura = " + y);
        System.out.println("---------------------");
        
        Arbol tree1 = new Arbol(2.4f, 15);
        Arbol tree2 = new Arbol(2.4f, 15);
        Arbol tree3 = new Arbol(2.4f, 15);
        Arbol tree4 = new Arbol(2.4f, 15);
        System.out.println(tree1);
        
        System.out.println("Troncos de un arbol = " + Arbol.tronco);
        System.out.println("Troncos de un arbol = " + tree1.tronco);
        System.out.println("Troncos de un arbol = " + tree2.tronco);
        System.out.println("Troncos de un arbol = " + tree3.tronco);
        
        Arbol.generarOxigeno();
        
        JOptionPane.showMessageDialog(null, "Hola mundo", "Aquí va el título", JOptionPane.ERROR_MESSAGE);
        String dato = JOptionPane.showInputDialog(null, "Dame tu edad", "Introducir datos", JOptionPane.QUESTION_MESSAGE);
        System.out.println(dato);
    }
    
}