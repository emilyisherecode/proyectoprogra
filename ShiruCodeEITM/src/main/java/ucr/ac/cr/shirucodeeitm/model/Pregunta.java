/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.model;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Pregunta {
    private String enunciado, respuesta, explicacion;
    private ArrayList<String> opciones;

    public Pregunta() {
        this.opciones = new ArrayList<>();
    }

    public Pregunta(String enunciado, String respuesta, String explicacion) {
        this.enunciado = enunciado;
        this.respuesta = respuesta;
        this.explicacion = explicacion;
        this.opciones = new ArrayList<>();
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getExplicacion() {
        return explicacion;
    }

    public void setExplicacion(String explicacion) {
        this.explicacion = explicacion;
    }

    public void addOpcion(String opcion) {
        this.opciones.add(opcion);
    }

    public String getOpcion(int indice) {
        return opciones.get(indice);
    }
    
    @Override
    public String toString() {
        return "Pregunta{" + "enunciado=" + enunciado + ", respuesta=" + respuesta + '}';
    }
}
