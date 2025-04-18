/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class balok {
     int panjang, lebar, tinggi, volume;
     
     public balok(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        computeAndSetVolume();
    }

    public void computeAndSetVolume() {
        this.volume = this.panjang * this.lebar * this.tinggi;
    }

    public int getVolume() {
        return this.volume;
    }
}
