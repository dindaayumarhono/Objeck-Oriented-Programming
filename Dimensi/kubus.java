/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class kubus {
    public int sisi;
    public int volume;
    
    public void SetSisi (int sisi){
        this.sisi = sisi;
    }
    
    public void computeAndSetVolume() {
        this.volume = sisi * sisi * sisi;
    }
    
    public int GetVolume (){
        return this.volume;
    }
}
