/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioRadio;


import java.lang.String;
/**
 *
 * @author OscarIvan
 */
public interface iRadio {
    public void OnOff();
    public boolean isOn();
    public String getFrecuency();
    public void changeFrecuency();
    public String getStation();   
    public void Forward();
    public void Backward();
    public void setMemory(int Position);
    public String ToString();
}
