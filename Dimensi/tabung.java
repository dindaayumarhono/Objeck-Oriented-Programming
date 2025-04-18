/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class tabung {
    public double radius;
    public int tinggi;
    public double volume;
    
    public void SetRadius (double radius){
        this.radius = radius;
    }
    
    public void SetTinggi (int tinggi) {
        this.tinggi = tinggi;
    }
    
    public void computeAndSetVolume() {
        this.volume = Math.PI * radius * radius * tinggi;
    }
    
    public double GetVolume() {
        return this.volume;
    }
}
