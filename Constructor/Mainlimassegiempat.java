/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class Mainlimassegiempat {
    public static void main(String[] args) {
        Limassegiempat limas1 = new Limassegiempat(6, 10);
        limas1.computeAndSetVolume();
        System.out.println("Sisi alas: " + limas1.sisi);
        System.out.println("Tinggi: "+ limas1.tinggi);
        System.out.println("Volume: " + limas1.getVolume());
    }
}
