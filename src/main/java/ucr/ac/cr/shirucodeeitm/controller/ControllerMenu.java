

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.shirucodeeitm.model.RegisterLecciones;
import ucr.ac.cr.shirucodeeitm.view.FrmCapitulo;
import ucr.ac.cr.shirucodeeitm.view.FrmGlosario;
import ucr.ac.cr.shirucodeeitm.view.FrmInicio;


/**
 *
 * @author LENOVO
 */
public class ControllerMenu implements ActionListener{

    private FrmInicio frmInicio;
    private FrmGlosario frmGlosario;
    private RegisterLecciones lecciones;
    public ControllerMenu() {
        this.frmInicio=new FrmInicio();
        this.frmInicio.listenerButton(this);
        this.frmInicio.setLocationRelativeTo(null);
        this.frmInicio.setVisible(true);
        this.lecciones = new RegisterLecciones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String comando = e.getActionCommand();

        switch (comando) {

            case "INICIAR":
                this.frmInicio.dispose();
                new ControllerCapitulos(lecciones, frmInicio);
                break;

            case "GLOSARIO":
                frmGlosario = new FrmGlosario();
                frmGlosario.listenerMenu(this);
                frmGlosario.setLocationRelativeTo(null);
                frmGlosario.setVisible(true);
                frmInicio.dispose();

                break;

            case "SALIR":
                System.exit(0);
                break;
        }
    }
    
}
