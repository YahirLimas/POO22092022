/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libro;

/**
 *
 * @author YAHIR LIMAS
 */
public class Libro {
    private String genero;
    private int paginas;
    private String autor;
    private int fecha;
    private String idioma;

    public Libro() {
    }

    public Libro(String genero, int paginas, String autor, int fecha, String idioma) {
        this.genero = genero;
        this.paginas = paginas;
        this.autor = autor;
        this.fecha = fecha;
        this.idioma = idioma;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libro lib1=new Libro();
        lib1.setGenero("Suspenso");
        System.out.println("El género del libro es: " + lib1.getGenero() + ".");
        lib1.setPaginas(368);
        System.out.println("El libro tiene " + lib1.getPaginas() + " páginas.");
        lib1.setAutor("Tolkien");
        System.out.println("Autor del libro: " + lib1.getAutor() + ".");
        lib1.setFecha(2015);
        System.out.println("Fecha de publicación: 2015" + lib1.getFecha() + ".");
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
}