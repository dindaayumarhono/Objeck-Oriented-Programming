/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class bola {
     double radius, volume;
    
    public bola(double radius) {
        this.radius = radius;
        computeAndSetVolume();
    }

    public void computeAndSetVolume() {
        this.volume = (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public double getVolume() {
        return this.volume;
    }
}

