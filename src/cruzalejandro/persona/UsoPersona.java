/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cruzalejandro.persona;

/**
 *
 * @author EntornoVM
 */
public class UsoPersona {
    
    public static void main(String[] args){
    
    Persona Usuario1 = new Persona();
    Persona Usuario2 = new Persona(3000000);
    Persona Usuario3 = new Persona(3000000,"Alejandro");
    Persona Usuario4 = new Persona(3000000,"Alejandro","Cruz");
    
        System.out.println(Usuario1.getDatos());
        System.out.println(Usuario2.getDatos());
        System.out.println(Usuario3.getDatos());
        System.out.println(Usuario4.getDatos());
}
}

////////////////////////////////////////////////////////////////////////////////

class Persona{
    
    public Persona() { //Constructor por defecto
    }
    
    public Persona(int dni){ //Constructor por DNI
        
        this.dni= dni;
        
    }
    public Persona (int dni, String nombre){//Constructor por DNI y Nombre
        this.dni= dni;
        this.nombre= nombre;
    }
    
    public Persona(int dni, String nombre, String apellido){//Constructor por DNI,Nombre,Apellido
        this.dni= dni;
        this.nombre= nombre;
        this.apellido= apellido;
    }
    
    //Propiedades
    private int dni;
    private String nombre;
    private String apellido;
    
    
    //Metodos
    
    public String getDatos(){
        
        return "La persona tiene estos datos: " +this.dni+"-"+this.nombre+"-"+this.apellido;
    }
}
