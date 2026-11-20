/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ucr.ac.cr.shirucodeeitm.model.RegisterLecciones;
import ucr.ac.cr.shirucodeeitm.view.FrmCapitulo;
import ucr.ac.cr.shirucodeeitm.view.FrmPaginas;
import ucr.ac.cr.shirucodeeitm.view.PanelBotonesPagina;
import ucr.ac.cr.shirucodeeitm.view.PanelPaginas;

/**
 *
 * @author LENOVO
 */
public class ControllerPaginas implements ActionListener{
    private FrmPaginas frmPaginas;
    private FrmCapitulo capitulos;
    private PanelPaginas paginas;
    private RegisterLecciones lecciones;
    private PanelBotonesPagina botones;;
    public ControllerPaginas(RegisterLecciones lecciones, FrmCapitulo capitulo) {
        this.frmPaginas = new FrmPaginas();
        this.paginas = this.frmPaginas.getPanelPaginas();
        this.capitulos = capitulo;
        this.lecciones = lecciones;
        this.botones = this.frmPaginas.getPanelBotonesPagina1();
        this.botones.listenerButton(this);
        this.paginas.actualizarPagina(lecciones, lecciones.getCapitulo(), 0);
        this.frmPaginas.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "ANTERIOR":
                actualizar(-1);
                break;
                
            case "COMPROBAR":
                paginas.validar(lecciones, lecciones.getCapitulo(), lecciones.getPaginas());
                break;
                
            case "SIGUIENTE":
                actualizar(1);
                break;
                
            case "VOLVER":
                this.frmPaginas.dispose();
                capitulos.setVisible(true);
                break;    
        }
    }
    
    private void actualizar(int direccion) {
        int cap = lecciones.getCapitulo();
        int temporal = lecciones.getPaginas() + direccion;
        if (temporal >= 0 && temporal < lecciones.getLeccion(cap).getPreguntas().size()) {
            lecciones.setPaginas(temporal);
            paginas.actualizarPagina(lecciones, cap, temporal);
        }
    }

}
