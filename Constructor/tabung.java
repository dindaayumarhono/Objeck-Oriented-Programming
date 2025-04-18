/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class tabung {
     double radius, tinggi, volume;

    public tabung(double radius, double tinggi) {
        this.radius = radius;
        this.tinggi = tinggi;
        computeAndSetVolume();
    }

    public void computeAndSetVolume() {
        this.volume = Math.PI * radius * radius * this.tinggi;
    }

    public double getVolume() {
        return this.volume;
    }
}

