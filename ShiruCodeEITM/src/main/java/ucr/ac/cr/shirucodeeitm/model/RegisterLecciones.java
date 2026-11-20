/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucr.ac.cr.shirucodeeitm.model;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class RegisterLecciones {
    
    private ArrayList<Leccion> lecciones;
    private CargadorLecciones cargar;
    
    public RegisterLecciones() {
        this.lecciones = new ArrayList<>();
        this.cargar = new CargadorLecciones();
        cargarLecciones();
    }
    
    private void cargarLecciones() {
        File carpeta = new File("contenido");
        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            for (int i = 1; i <= archivos.length; i++) {
                Leccion leccion = cargar.cargarCapitulo(i);
                if (leccion != null) {
                    lecciones.add(leccion);
                }
            }
        }
    }
    
    public String getEnunciado(int i, int j){
        return lecciones.get(i).getPregunta(j).getEnunciado();
    }
    
    public String getRespuesta(int i, int j){
        return lecciones.get(i).getPregunta(j).getRespuesta();
    }
    
    public String getExplicacionPregunta(int i, int j){
        return lecciones.get(i).getPregunta(j).getExplicacion();
    }
    
    public String getOpciones(int i, int j, int o){
        return lecciones.get(i).getPregunta(j).getOpcion(o);
    }
    
    public String getTitulo(int i){
        return lecciones.get(i).getTitulo();
    }
    
    public String getObjetivo(int i){
        return lecciones.get(i).getObjetivo();
    }
    
    public String getDescripcion(int i){
        return lecciones.get(i).getDescripcion();
    }
    
    public String getCapitulo(int i){
        return lecciones.get(i).getCapitulo();
    }
    
    public String getExplicacion(int i){
        return lecciones.get(i).getExplicacion();
    }
    
    public String getReTem(int i){
        if(lecciones.get(i) instanceof LeccionVocabulario){
            LeccionVocabulario lV = (LeccionVocabulario)lecciones.get(i);
            return lV.getTema();
        }else if(lecciones.get(i) instanceof LeccionGramatica){
            LeccionGramatica lG = (LeccionGramatica)lecciones.get(i);
            return lG.getRegla();
        }
        return null;
    }
    
    public ArrayList<Leccion> getLecciones() {
        return lecciones;
    }
    
    public Leccion getLeccion(int indice) {
        return lecciones.get(indice);
    }

}
