/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructorarrayobject;

/**
 *
 * @author LENOVO
 */
public class Maintabung {
    public static void main(String[] args) {
        tabung tabung1 = new tabung(7, 10);
        tabung1.computeAndSetVolume();
        System.out.println("jari-jari: " + tabung1.radius); 
        System.out.println("tinggi: " + tabung1.tinggi); 
        System.out.println("volume: " + tabung1.getVolume());
    }
}
