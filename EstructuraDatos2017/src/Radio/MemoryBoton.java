/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRadio;

/**
 *
 * @author OscarIvan
 */
public class MemoryBoton{

    String frecuency;
    String station; 
    
    public MemoryBoton (String frecuency, String station)
    {
        this.frecuency= frecuency;
        this.station = station;
    }
    public String Push() {
        return frecuency.concat("|").concat(station);
    }
    
    public void Hold(String frecuency, String station) {
        this.frecuency = frecuency;
        this.station = station;
    }
    
}
