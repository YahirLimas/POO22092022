/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cifradocesar;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author YAHIR LIMAS
 */
public class VentanaCesar extends JFrame{
    private JTextArea mensaje;
    private JTextArea cifrado;
    private JTextField numDes;
    private JButton boton;
    private JLabel consejo;

    public VentanaCesar() throws HeadlessException {
        setTitle("Cifrado de mensajes: Cesar");
        setSize(850, 400);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        Image icono = Toolkit.getDefaultToolkit().getImage(getClass().getResource("icono.png"));
        setIconImage(icono);
        
        Font fuente = new Font("Cambria", Font.BOLD, 14);     
        
        Border margen = new LineBorder(Color.GREEN);
        Border tamanoBordes = new EmptyBorder(25, 200, 25, 200);
        Border borde = new CompoundBorder(margen, tamanoBordes);        
        
        mensaje = new JTextArea(10, 25);
        mensaje.setText("Escribe aquí el mensaje para descifrar...");
        mensaje.setFont(fuente);     
        
        cifrado = new JTextArea(10, 25);
        cifrado.setText("Aquí se desplegará tu mensaje cifrado...");
        cifrado.setFont(fuente);        
        
        consejo = new JLabel("Ingrese el número de desplazamiento: ");
        consejo.setFont(fuente);
        
        numDes = new JTextField(8);
        numDes.setFont(fuente);
        numDes.setText("Ej: 5");
        
        boton = new JButton();
        boton.setToolTipText("Cifrar mensaje");
        boton.setText("C I F R A R");
        boton.setForeground(Color.GREEN);
        boton.setBackground(Color.BLACK);
        boton.setBorder(borde);
        
        this.getContentPane().add(mensaje);
        this.getContentPane().add(cifrado);
        this.getContentPane().add(consejo);
        this.getContentPane().add(numDes);
        this.getContentPane().add(boton);
        this.validate();
        this.setVisible(true);
        
        this.boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int n;
                try {
                    n = Integer.parseInt(numDes.getText());
                    char caracter;
                    String textoCodificado = "";
                    String texto = mensaje.getText().toUpperCase();
                    String letras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
                    for (int i = 0; i < texto.length(); i++) {
                        caracter = texto.charAt(i);
                        
                        int pos = letras.indexOf(caracter);
                        
                        if(pos == -1){
                            textoCodificado += caracter;
                        }else{
                            textoCodificado += letras.charAt((pos + n) % letras.length());
                        }
                    }
                    cifrado.setText(textoCodificado);
                } catch (NumberFormatException ex) {
                    System.out.println(ex.toString());
                    JOptionPane.showMessageDialog(null, "Introduce un valor numérico entero", "Error de captura", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }   
}