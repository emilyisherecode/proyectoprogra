

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.shirucodeeitm.view.FrmCapitulo;
import ucr.ac.cr.shirucodeeitm.view.FrmGlosario;
import ucr.ac.cr.shirucodeeitm.view.FrmInicio;


/**
 *
 * @author LENOVO
 */
public class ControllerMenu implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   /* private FrmInicio frmInicio;
    private FrmCapitulo frmCapitulo;
    private FrmGlosario frmGlosario;
    
    public ControllerMenu() {
        this.frmInicio=new FrmInicio();
        this.frmInicio.listenerButton(this);
        this.frmInicio.setLocationRelativeTo(null);
        this.frmInicio.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String comando = e.getActionCommand();

        switch (comando) {

            case "INICIAR":
                frmCapitulo = new FrmCapitulo();
                frmCapitulo.listenerButton(this);
                frmCapitulo.setLocationRelativeTo(null);
                frmCapitulo.setVisible(true);
                frmInicio.dispose();
                break;

            case "GLOSARIO":
                frmGlosario = new FrmGlosario();
                frmGlosario.listenerMenu(this);
                frmGlosario.setLocationRelativeTo(null);
                frmGlosario.setVisible(true);
                frmInicio.dispose();

                break;

            case "MENU":
                if (frmCapitulo != null) {
                    frmCapitulo.dispose();
                }
                if (frmGlosario != null) {
                    frmGlosario.dispose();
                }

                frmInicio = new FrmInicio();
                frmInicio.listenerButton(this);
                
                frmInicio.setLocationRelativeTo(null);
                frmInicio.setVisible(true);
                break;

            case "SALIR":
                System.exit(0);
                break;

            case "COMENZAR":
                System.out.println("Comenzar leccion");
                break;

            case "COMPROBAR":
                System.out.println("Comprobar respuesta");
                break;

            case "SIGUIENTE":
                System.out.println("Siguiente leccion");
                break;
        }
    }
    */
}
