/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Password {

    private String contraseña;
    private int longitud;

    public Password(String contraseña) {
        this.contraseña = contraseña;
        this.longitud = 8;

    }

    public String getContraseña() {
        return contraseña;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String CambiarContraseña() {
        String aux;

        JOptionPane.showMessageDialog(null, "Digite una nueva contraseña");
        aux=this.contraseña;

        JOptionPane.showMessageDialog(null, "Nueva contraseña guardada");

        return (aux);

    }
}
