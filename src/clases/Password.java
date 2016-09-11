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
        String aux;
        int res;
        res = JOptionPane.showConfirmDialog(null, "¿Seguro que desea cambiar la contraseña?", "¡Alerta!", JOptionPane.YES_NO_OPTION);
        if (res == 0) {

            aux = JOptionPane.showInputDialog(this, "Digite su nueva contraseña");
            this.contraseña = aux;

            while (aux.length() < 6) {
                aux = JOptionPane.showInputDialog(this, "Contraseña debil, digite otra contraseña");
            }

        } else {
            JOptionPane.showInputDialog("Su contraseña es: " + this.contraseña);
        }
        return this.contraseña;

    }
}
