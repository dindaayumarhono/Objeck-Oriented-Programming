/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class Mainbalok {
    public static void main(String[] args) {
    balok balok1 = new balok(5, 3, 2);
    balok1.computeAndSetVolume();
    System.out.println("panjang: " + balok1.panjang);
    System.out.println("lebar: " + balok1.lebar); 
    System.out.println("tinggi: " + balok1.tinggi); 
    System.out.println("volume: " + balok1.getVolume());
    }
}
