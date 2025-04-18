/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class Limassegiempat {
     double sisi, tinggi, volume;

    public Limassegiempat(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
        computeAndSetVolume();
    }

    public void computeAndSetVolume() {
        double luasalas = sisi * sisi;
        this.volume = (1.0 / 3) * luasalas * tinggi;
    }

    public double getVolume() {
        return this.volume;
    }
}

