/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classdimensi;

/**
 *
 * @author LENOVO
 */
public class bola {
    public double radius;
    public double volume;
    
    public void SetRadius(double radius){
        this.radius = radius;
    }
    
    public void computeAndSetVolume(){
        this.volume = 4/3 * Math.PI * Math.pow(radius, 3);
    }
    
    public double GetVolume(){
        return this.volume;
    }
}
