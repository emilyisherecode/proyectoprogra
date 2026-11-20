/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.shirucodeeitm.model.RegisterLecciones;
import ucr.ac.cr.shirucodeeitm.view.FrmCapitulo;
import ucr.ac.cr.shirucodeeitm.view.FrmInicio;
import ucr.ac.cr.shirucodeeitm.view.PanelCapitulo;
import ucr.ac.cr.shirucodeeitm.view.PanelDataBotonesCap;


/**
 *
 * @author LENOVO
 */
public class ControllerCapitulos implements ActionListener{
    private FrmCapitulo frmCapitulo;
    private FrmInicio inicio;
    private PanelCapitulo capitulo;
    private PanelDataBotonesCap botones;
    private RegisterLecciones lecciones;
    public ControllerCapitulos(RegisterLecciones lecciones, FrmInicio frmInicio) {
        this.lecciones = lecciones;
        this.inicio = frmInicio;
        this.frmCapitulo = new FrmCapitulo();
        this.capitulo = this.frmCapitulo.getPanelCapitulo();
        this.botones = this.frmCapitulo.getPanelBotonesCap();
        this.botones.listenerButton(this);
        this.capitulo.actualizarCapitulo(lecciones, 0);
        this.frmCapitulo.setLocationRelativeTo(null);
        this.frmCapitulo.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        switch (comando) {

            case "COMENZAR":
                new ControllerPaginas(lecciones, frmCapitulo);
                frmCapitulo.dispose();
                break;

            case "ANTERIOR":
                capitulo.actualizarCapitulo(lecciones, actualizar(-1));
                break;

            case "SIGUIENTE":
                capitulo.actualizarCapitulo(lecciones, actualizar(1));
                break;
                
            case "MENU":
                this.frmCapitulo.dispose();
                this.inicio.setVisible(true);
                break;
        }
    }

    private int actualizar(int direccion) {
        int cap = lecciones.getCapitulo();
        int temporal = cap + direccion;
        if (temporal >= 0 && temporal < lecciones.getLecciones().size()) {
            lecciones.setCapitulo(temporal);
            return temporal;
        }
        return lecciones.getCapitulo();
    }
}
