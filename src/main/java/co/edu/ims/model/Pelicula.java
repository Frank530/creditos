package co.edu.ims.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 1061738544
 */
public class Pelicula {
    
    private String titulo;
    private int anio;
    private List<Director> director;
    private List<Genero> genero;

    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, List<Director> director,List<Genero> genero) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
        this.genero = genero;
    }
    
    public Pelicula(String t){
        this.titulo = t;
        this.anio = 1;
        this.director = new ArrayList<Director>();
        
        
    }
    
    public String mostrarDatos(){
        return "Titulo: "+ titulo + " Año: "+ anio +" Director: "+ director;
    }
    
    
    public int getAnio() {
        return anio;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public List<Director> getDirector(){
        return director;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void setTitulo(String titulo){
        this.titulo =titulo;
    }
    
    public void setDirector(List<Director> director){
        this.director =director;
    }

    public List<Genero> getGenero() {
        return genero;
    }

    public void setGenero(List<Genero> genero) {
        this.genero = genero;
    }

    
    
    
 }
