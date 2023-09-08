
package mx.itson.tortilla.negocio;
/**
 * Contiene metodos para trabajar con cadenas de texto 
 * @author Ricardo Rodriguez 
*/
public class Operacion {
    
    /**
    *Separa una cadena de texto donde encuentre el caracter guion medio 
    * @param oracion Es la oracion que sera separada en fracciones
    * @return Array de String en cuyo cada componente sera una fraccion de la cadena 
    */
    
 public String[] separar(String oracion){     
    String[] resultado = oracion.split("-");
     
    return resultado;
 }
     
}






