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
    private int longitud = 8;

    public Password(String contraseña) {
        this.contraseña = contraseña;

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
        String aux = null;
        int res, sw, sw1;
        boolean au = true;
        do {
            sw = 1;

            try {
                aux = JOptionPane.showInputDialog("Digite una nueva contraseña");

                if (aux.length() < 6) {

                    JOptionPane.showMessageDialog(null, "Contraseña débil, intente de nuevo");
                    sw1 = 0;

                } else {
                    JOptionPane.showMessageDialog(null, "Nueva contraseña guardada");
                    this.contraseña = aux;
                    sw1 = 1;
                }

            } catch (NullPointerException e) {
                res = JOptionPane.showConfirmDialog(null, "¿Desea Abandonar?", "Salir", JOptionPane.YES_NO_OPTION);
                if (res == 0) {
                    au = false;
                    sw = 1;
                } else {
                    sw = 0;
                }
            }
        } while (sw == 0);

        return this.contraseña;

    }
}
