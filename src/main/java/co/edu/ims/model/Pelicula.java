package co.edu.ims.model;

/**
 * @author 1061738544
 */
public class Pelicula {
    
    private String titulo;
    private int anio;
    private Director director;

    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, Director director) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
    }
    
    public Pelicula(String t){
        titulo=t;
        anio=1;
        director=new Director("frank","salamanca",2454,"calle 229");
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
    
    public Director getDirector(){
        return director;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    public void setTitulo(String titulo){
        this.titulo =titulo;
    }
    
    public void setDirector(Director director){
        this.director =director;
    }
 }
