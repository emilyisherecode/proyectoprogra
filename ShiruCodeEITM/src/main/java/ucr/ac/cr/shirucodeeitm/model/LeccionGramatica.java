/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.model;

/**
 *
 * @author LENOVO
 */
public class LeccionGramatica extends Leccion {
    private String regla;

    public LeccionGramatica() {
    }

    public LeccionGramatica(String titulo, String descripcion, String regla) {
        super(titulo, descripcion);
        this.regla = regla;
    }

    public String getRegla() {
        return regla;
    }

    public void setRegla(String regla) {
        this.regla = regla;
    }

    @Override
    public String getIndicacion() {
        return "Escriba la palabra que completa la oración (no importan las mayúsculas).";
    }

    @Override
    public String getContenido() {
        return super.getContenido() + "\nRegla gramatical: " + regla;
    }

    @Override
    public boolean evaluar(Pregunta pregunta, String respuesta) {
        return pregunta.getRespuesta().equalsIgnoreCase(respuesta.trim());
    }
}
