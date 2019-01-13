
package unoseminario;


public class UnoSeminario {

   
    public static void main(String[] args) {
        Alumno oswaldo = new Alumno(2012602705,"Oswaldo Peralta Saldivar");
        Alumno alfonso = new Alumno(2010672389,"Alfonso Peralta Saldivar");
       
        
        oswaldo.muestra();
        alfonso.muestra();
        
        
        System.out.println("Oswi pagó la cantidad de:"+oswaldo.pagaInscripcion());
        
        
        System.out.println("Alfi pagó la cantidad de: "+alfonso.pagaInscripcion());
        
    }
    
}
