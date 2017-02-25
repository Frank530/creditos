package co.edu.ims.model;

/**
 * @author 1061738544
 */
public class Genero {
    private static String nombre;
    private static int codigo;
    private static String descripcion;
    
    public Genero(){
    }
    
    public Genero(String nombre,int codigo,String descripcion){
        this.nombre=nombre;
        this.codigo=codigo;
        this.descripcion=descripcion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo=codigo;
    } 
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
}

