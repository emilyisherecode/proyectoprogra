/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucr.ac.cr.shirucodeeitm;

import ucr.ac.cr.shirucodeeitm.controller.ControllerMenu;
import ucr.ac.cr.shirucodeeitm.model.RegisterLecciones;



/**
 *
 * @author LENOVO
 */
public class ShiruCodeEITM {

    public static void main(String[] args) {
        RegisterLecciones leccion = new RegisterLecciones();
        for (int i = 0; i < leccion.getPreguntas().size(); i++) {
            System.out.print(leccion.getTitulo(i)+"\n");
            
            new ControllerMenu();
        }
    }
}
