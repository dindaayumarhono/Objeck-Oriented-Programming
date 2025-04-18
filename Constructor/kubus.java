/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class kubus {
     int sisi, volume;

    public kubus(int sisi) {
        this.sisi = sisi;
        computeAndSetVolume();
    }

    public void computeAndSetVolume() {
        this.volume = this.sisi * this.sisi * this.sisi;
    }

    public int getVolume() {
        return this.volume;
    }

}


