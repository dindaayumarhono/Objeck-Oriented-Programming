/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class limassegiempat {
    public int sisi;
    public int tinggi;
    public int volume;
    
    public void SetSisi (int sisi){
        this.sisi = sisi;
    }
    
    public void SetTinggi (int tinggi){
        this.tinggi = tinggi;
    }
    
    public void computeAndSetVolume(){
        this.volume = ((sisi * sisi) * tinggi ) / 3;
    }
    
    public int GetVolume(){
        return this.volume;
    }
}
