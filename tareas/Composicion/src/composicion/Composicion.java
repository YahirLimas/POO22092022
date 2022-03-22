/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package composicion;

import Libro.Libro;
import Libro.Editorial;
import Libro.Autor;
import Pelicula.Pelicula;
import Pelicula.Actor;
import Pelicula.Productora;
import Pelicula.Director;

/**
 *
 * @author YAHIR LIMAS
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib = new Libro();
        lib.setNombre("Harry Potter");
        
        Autor autora = new Autor();
        autora.setNombre("JK Rowling");
        autora.setEdad(56);
        autora.escribir(lib.getNombre());
        
        lib.setAutor(autora);
        lib.setEditorial(new Editorial("Bloomsbury", "Londres"));
        System.out.println(lib);
        
        Editorial edit = new Editorial();
        edit.getNombre();
        edit.getSucursal();
        edit.publicar(lib.getNombre());
        
        System.out.println("\n");
        Pelicula peli = new Pelicula();
        peli.setNombre("Star Wars");
        
        Actor actor = new Actor("Estadounidense", 70);
        actor.llorar();

        peli.setProductora(new Productora("Lucasfilm", "George Lucas"));
        peli.getProductora().rodaje();
        
        Director dire = new Director();
        dire.setIdioma("Inglés");
        dire.setNombre("George Lucas");
        dire.dirigir();
        
        peli.setDirector(dire);
        peli.setActor(actor);        
        System.out.println(peli);
    }   
}