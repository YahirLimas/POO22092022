 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentahabiente;

/**
 *
 * @author YAHIR LIMAS
 */
public class PruebaEjemplo {
    public static void main(String[] args) {
        // TODO code application logic here
        /*Se debe crear un arreglo de 5 cuentahabientes con datos de ejemplo
        y con un FOR EACH deben mostrar quien es Premium y quien es Regular*/
        Cuentahabiente[] personas = new Cuentahabiente[5];
        personas[0] = new Cuentahabiente(117, "John", 50000);
        personas[1] = new Cuentahabiente(404, "Juan", 23651);
        personas[2] = new Cuentahabiente(516, "Mike", 100000);
        personas[3] = new Cuentahabiente(123, "Jonathan", 99000);
        personas[4] = new Cuentahabiente(999, "Gerardo", 10000);
        
        for (Cuentahabiente cuentahabiente : personas) {
            System.out.println(cuentahabiente.evaluarNivelCliente());
        }
    }
}