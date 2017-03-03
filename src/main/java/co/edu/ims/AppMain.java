package co.edu.ims;

import co.edu.ims.model.Director;
import co.edu.ims.model.Genero;
import co.edu.ims.model.Pelicula;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 1061738544
 */
public class AppMain {
    
    public static void main(String[] args) {
        Genero terror = new Genero("Terror", 11, "ninguna");
        Director direct = new Director("frank","salamanca",1231,"los angeles");
        List<Director> director= new ArrayList<Director>();
        List<Genero> genero= new ArrayList<Genero>();
        
        director.add(direct);
        genero.add(terror);
        
        Pelicula bastardos = new Pelicula();
        
        try {
            bastardos.setDirector(director);
            bastardos.setGenero(genero);

        } catch (NullPointerException e) {
            System.out.println("Error encontrado"+e);
        }
        bastardos.setAnio(1192);
       
        
        System.out.println(bastardos.getGenero().get(0).getNombre());
        
        
        
    }
    
}
