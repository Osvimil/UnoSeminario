
package unoseminario;


public class Alumno {
    
    private int boleta;
    private String nombre;
    private static final int pagoInscripcion=7300;
    
    
    public Alumno(int boleta,String nombre){
        this.boleta=boleta;
        this.nombre=nombre;
    
    }
    
    public void setBoleta(int boleta){
        this.boleta=boleta;
    }
    public int getBoleta(){
        return boleta;
    }
    public void setNombre(String nombre){
        nombre=nombre;
        
    }
    public String getNombre(){
        return nombre;
    }
    public int pagaInscripcion(){
        return pagoInscripcion;
    }
    public void muestra(){
        System.out.println("Boleta: "+boleta+" "+"Nombre: "+nombre);
    }  
}
