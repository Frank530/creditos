package co.edu.ims.model;

/**
 * @author 1061738544
 */
public class Director {
    private String nombre;
    private String apellidos;
    private int telefono;
    private String direccion;
    
    public Director(){
    }
    
    public Director(String nombre,String apellidos,int telefono,String direccion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public int getTelefono(){
        return telefono;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
}
