package Package1;

import java.util.*;

/**
 * 
 */
public class Receptor {

    /**
     * Default constructor
     */
    public Receptor() {
    }

    /**
     * 
     */
    public String nombre;

    /**
     * 
     */
    public int cuenta;

    /**
     * 
     */
    public String direccion;

    /**
     * @return
     */
    public boolean aprovarTransaccion() {
        // TODO implement here
        if(cuenta== 123){

            return true;

        }
        return false;
    }

    /**
     * @return
     */
    public void notificar() {
        // TODO implement here
        
    }

    /**
     * @return
     */
    public void corroborarDatosBancarios() {
        // TODO implement here
        
    }

}